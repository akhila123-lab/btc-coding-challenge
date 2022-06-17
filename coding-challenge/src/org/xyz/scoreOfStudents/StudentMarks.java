package org.xyz.scoreOfStudents;

import java.util.Scanner;

public class StudentMarks {

    /* adding 4 integer values.*/


    public int calculateMarks(int physics, int chemistry, int maths) {


        return physics+chemistry+maths;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio) {
       

        return physics+chemistry+maths+bio;
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio) {
   	 

        return physics+chemistry+maths+bio;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {


        return physics+chemistry+maths+bio+lang;
    }


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry) {



        return maths+bio+physics+chemistry;
    }
public static void main(String[] args) {
	System.out.println("static method call "+calculateMarks(78, 57, 65, 45, 37));
		
		StudentMarks s=new StudentMarks();
		String choice;
		System.out.println("enter choice");
		Scanner sc=new Scanner(System.in);	
		choice=sc.next();
		if(choice.equals("medical"))
		{
			int dd=s.calculateMarks(37, 20, 89, 65);
			System.out.println(dd);
		}
		else if(choice.equals("non medical"))
		{
			int ddd=s.calculateMarks(72, 87, 96);
		
		    System.out.println(ddd);
		}
		else
		{
			System.out.println(s.calculateMarks(89, 67, 61));
		}
			
	}

	


}
