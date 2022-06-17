package org.xyz.student.student;

public class MainChallenge {
	
	public static void main(String[] args) {
		
		StudentList st=new StudentList();
	
		st.getDetails();
		
		EvalAndGradTeam ed=new EvalAndGradTeam();
		System.out.println("    ");
	
		System.out.println("-----student marks-----------");
		ed.totalMarks(StudentList.studentList);
		System.out.println("    ");
		ReportGen r=new ReportGen();
		System.out.println("students with top score ");
		System.out.println(r.gettopScorer());
		r.clearedExam();
		System.out.println("    ");
		System.out.println("students with grade score ");
		SurveyAndStatistics ss=new SurveyAndStatistics();
		ss.calculateGrade();
		System.out.println("------------order of students with top score is:----------");
		ss.descendingOrder();
		
		
		
	
	}
}
