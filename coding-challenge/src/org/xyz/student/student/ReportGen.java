package org.xyz.student.student;

import java.util.*;
public class ReportGen// extends Student
{
	List<Student> students=StudentList.studentList;

	public String gettopScorer() {
		for(int i=0;i<students.size();i++)
		{
			students.get(i).setTotal(students.get(i).getChemistry()+students.get(i).getMaths()+students.get(i).getPhysics());
		}
		int pos=0;
		int max=students.get(0).getTotal();
		for(int j=0;j<students.size();j++)
		{
			if(max<students.get(j).getTotal())
			{
				max=students.get(j).getTotal();
				pos=j;
			}
		}
		
		return students.get(pos).getSname()+" "+students.get(pos).getTotal();
	}
	
	public void clearedExam() {
		
		List<String> clearStu=new ArrayList<String>();
		List<String> nonclearStu=new ArrayList<String>();
		
//		int max=students.get(0).getTotal();
		for(int i=0;i<students.size();i++)
		{
			if(students.get(i).getChemistry()>=35 && students.get(i).getPhysics()>=35 && students.get(i).getMaths()>=35)
				clearStu.add( students.get(i).getSname());
			else
				nonclearStu.add( students.get(i).getSname());
			
		}
		System.out.println("cleared students are:");
		System.out.println(clearStu);
		
		System.out.println("non clared students are:");
		System.out.println(nonclearStu);
		
	}

	
}
