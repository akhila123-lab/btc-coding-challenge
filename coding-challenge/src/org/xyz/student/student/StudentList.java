//package com.xyz.student;
package org.xyz.student.student;
import java.util.ArrayList;
import java.util.List;

public class StudentList extends Student{
	
	static List<Student> studentList =new ArrayList<Student>();
	StudentList()
	{
		Student s1=new Student(1,"akhila",36,39,45);
		Student s2=new Student(2,"asshu",56,69,95);
		Student s3=new Student(3,"devi",78,49,25);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		}
	public void getDetails()
	{
	System.out.println("Student details are:");
		for(Student sd:studentList)
			System.out.println(sd.getSname()+" chemistry marks are: "+sd.getChemistry()+" physics marks are: "+sd.getPhysics()+" maths marks are: "+sd.getMaths());
	}
	
}


