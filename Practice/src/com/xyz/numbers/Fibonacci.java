package com.xyz.numbers;

public class Fibonacci {

	public static void main(String[] args) {

		int n=10;
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++) {
			 c=a+b;
			 a=b;
			 b=c;
			 if(c<=n)
			 System.out.print(c+" ");
			
		}
			
	}

}
