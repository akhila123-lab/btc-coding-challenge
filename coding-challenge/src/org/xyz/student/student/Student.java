//package com.xyz.student;
package org.xyz.student.student;
public class Student {
	private int maths,chemistry,physics,total,rno;
	private String sname;
	private char grade;
	Student()
	{
		
	}
	public Student( int rno, String sname,int maths, int chemistry, int physics) {
		super();
		this.maths = maths;
		this.chemistry = chemistry;
		this.physics = physics;
		
		this.rno = rno;
		this.sname = sname;
	}
//	@Override
//	public String toString() {
//		return "Student [maths=" + maths + ", chemistry=" + chemistry + ", physics=" + physics + ", total=" + total
//				+ ", rno=" + rno + ", sname=" + sname + "]";
	
//}
	
	
	public int getMaths() {
		return maths;
	}
	@Override
	public String toString() {
		return " maths=" + maths + ", chemistry=" + chemistry + ", physics=" + physics + ", total=" + total
				+ ", rno=" + rno + ", sname=" + sname + ", grade=" + grade + ","+"\n";
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

}
