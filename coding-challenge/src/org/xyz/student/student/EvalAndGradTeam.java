//package com.xyz.student;
package org.xyz.student.student;
import java.util.ArrayList;
import java.util.List;

public class EvalAndGradTeam {
	List<Integer> studentMarks=new ArrayList<>();
	  public void totalMarks(List<Student> studentList)
	  {
		  
		  int totalmarks=0;
		  
		  
		  for(Student marks:studentList)
		  {
			totalmarks=marks.getChemistry()+marks.getMaths()+marks.getPhysics();
			System.out.println( marks.getSname()+" and total marks are:"+totalmarks);
			studentMarks.add(totalmarks);
		 }
		  
		  
		  System.out.println("    ");
		  System.out.println("---------average marks-------");
		  for(Student marks:studentList)
		  {
			  totalmarks= marks.getChemistry()+marks.getMaths()+marks.getPhysics();	
			  System.out.println("avegage marks of "+ marks.getSname()+" are : "+(float)totalmarks/3);  
		 }
		  
		  
		  int totalAvg=0;
		  for(Integer avgg:studentMarks)
		  {
			  totalAvg=totalAvg+avgg;
		  }
		  System.out.println("    ");
		  System.out.println("average marks for all the students are: "+ (float)totalAvg/3);
  
	  }
}
