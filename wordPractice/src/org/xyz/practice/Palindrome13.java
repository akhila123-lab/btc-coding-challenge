package org.xyz.practice;

import java.util.Scanner;

public class Palindrome13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value");
		int input1=sc.nextInt();
		System.out.println("enter the second value");
		int input2=sc.nextInt();
		int sum=0;
		for(int i=input1;i<=input2;i++)
		{
	
		boolean b=isPalindrome(i);
		if(b)
		{
			
		 sum=sum+i;
		}
			
			
	}
		System.out.println(sum);

}

	private static boolean isPalindrome(int i) {
		int temp=i,rev=0;
		do {
			int digit=i%10;
			rev=rev*10+digit;
			i=i/10;
			
		}while(i>0);
		
		return rev==temp;
	}


}
