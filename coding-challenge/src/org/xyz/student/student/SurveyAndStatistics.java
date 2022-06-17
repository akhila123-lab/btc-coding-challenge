package org.xyz.student.student;

import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.io.*;
import java.lang.*;

public class SurveyAndStatistics extends ReportGen  {
	 
	
	public void calculateGrade()
	{
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getTotal()>=200)
				students.get(i).setGrade('A');
			else if(students.get(i).getTotal()>=150 &&  students.get(i).getTotal()<200 )
				students.get(i).setGrade('B');
			else
				students.get(i).setGrade('C');
			
		}
		for(Student sd: students)
		{
			System.out.println(sd);
		}
		
		
	}
	Comparator<Student> comparebyTotalMarks = new Comparator<Student>() {
		public int compare(Student e1, Student e2) {
			return e2.getTotal() - e1.getTotal();
		}
	};
	public void descendingOrder()
	{
		Collections.sort(students,comparebyTotalMarks);
		for(Student sdd: students)
		{
			System.out.println(sdd);
		}
	}
	

	
	

}
