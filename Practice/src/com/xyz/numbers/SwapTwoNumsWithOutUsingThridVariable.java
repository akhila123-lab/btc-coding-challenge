package com.xyz.numbers;

public class SwapTwoNumsWithOutUsingThridVariable {

	public static void main(String[] args) {

		
			int i=10;
			int j=20;
//			i=i + j; //30
//			j=i-j; //30-20//10//i
//			i=i-j; //30-10//20//j
//			System.out.println("i="+i);
//			System.out.println("j="+j);
			
			int temp=i;
		
			i=j;
			j=temp;
			
			System.out.println("i="+i);
			System.out.println("j="+j);
			
	}

}
