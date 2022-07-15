package com.xyz.practice;

import java.util.Scanner;

public class Prog21 {

	public static void main(String[] args) {
//		5)the end of mail id should be .com;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mail id");
		String mailId=sc.next();
		char ch[]=mailId.toCharArray();
		int count=0;
		int atTheRateCount=0,dotCount=0;
		for(int i=0;i<mailId.length();i++) {
			atTheRateCount++;
			if(ch[i]=='@') {
				break;
			}
			}
//	System.out.println(atTheRateCount);
//	 System.out.println( ch[atTheRateCount-1]);
//	 System.out.println( ch[atTheRateCount+5]);
		dotCount=atTheRateCount+5;
//		1)@ & . should be present;
//		2)@ & . should not be repeated;
		for(int i=0;i<mailId.length();i++) {
//			4)there should be atleast 3 characters before @ ;
			if(atTheRateCount>3 && mailId.charAt(dotCount+1)=='c' && mailId.charAt(dotCount+2)=='o' && mailId.charAt(dotCount+3)=='m')//ere should be five charcters between @ and .;
			if(ch[atTheRateCount-1]=='@' && ch[atTheRateCount+5]=='.') {
			
			for(int j=0;j<mailId.length();j++) {
		
			if(ch[i]=='@' && ch[j]== '.') {
				count++;
			}
			}
			}
			}
		
			
		
	
		if(count==1) {
			System.out.println("Its a correct email");
		}
		else
			System.out.println("its not correct email");

	}

}
