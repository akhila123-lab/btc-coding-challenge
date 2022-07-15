package com.xyz.numbers;

public class Palindrome {

	public static void main(String[] args) {

		int n=101;
		int t=n;
		int rev=0;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n>0);
		if(rev==t) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");

	}

}
