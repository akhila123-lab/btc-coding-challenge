package com.xyz.practice;

import java.util.Scanner;

public class Prog23 {

	public static void main(String[] args) {

		String[] input={"01","01010","1000","10","011"} ;
		System.out.println("enter the first format");
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		System.out.println("enter the second format");
		String input2=sc.next();
		int count=0;
		//System.out.println(input2);
		for(int i=0;i<input.length;i++) {
			boolean b = isPrefix(input[i],input1,input2);
		//	System.out.println(b);
			if(b) {
				count++;
				
			}
		}
		System.out.println(count);
		
	}
	private static boolean isPrefix(String str,String value1, String value2) {
		char s[]=str.toCharArray();
		char input1[]=value1.toCharArray();
		char input2[]=value2.toCharArray();
		if(str.length()>value1.length()) {
			
	
			if((s[0]==input1[0] && s[1]==input1[1]) || (s[0]==input2[0] && s[1]==input2[1]) ) {
				return true;
			}
		}
	
		return false;
	}

}
