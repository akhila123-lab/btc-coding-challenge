package com.xyz.numbers;

public class ReverseNumber {

	public static void main(String[] args) {

		int n=19901;
		int rev=0;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n>0);
		System.out.println(rev);
	}

}
