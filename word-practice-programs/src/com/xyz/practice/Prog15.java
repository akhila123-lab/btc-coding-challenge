package com.xyz.practice;

public class Prog15 {

	public static void main(String[] args) {

		int n=175;
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d*d;
			n=n/10;
		}while(n>0);
		System.out.println(sum);
	}

}
