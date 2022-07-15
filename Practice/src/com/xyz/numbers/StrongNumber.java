package com.xyz.numbers;

public class StrongNumber {

	public static void main(String[] args) {

		int n=145;
		int t=n;
		int rev=0;
		do {
			int d=n%10;
			rev=rev*10+d*d*d;
			n=n/10;
		}while(n>0);
		if(rev==t) {
			System.out.println(rev);
			System.out.println("STrong number");
			
		}
		else {System.out.println(rev);
		System.out.println("STrong number");
	}
			
	}

}
