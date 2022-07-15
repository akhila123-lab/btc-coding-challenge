package com.xyz.practice;

import java.util.Scanner;

public class Prog13 {

	public static void main(String[] args) {
        System.out.println("enter first Number");
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		System.out.println("enter first Number");
		int last=sc.nextInt();
		int sum=0;
		for(int i=first;i<=last;i++) {
			boolean b=isPalindrome(i);
			if(b) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	
	}
	public static boolean isPalindrome(int x) {
		int temp=x;
		int rev=0;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}while(x>0);
		if(temp==rev) {
			System.out.println(rev);
		return true;
		}
		else
			return false;
			
	}

}
