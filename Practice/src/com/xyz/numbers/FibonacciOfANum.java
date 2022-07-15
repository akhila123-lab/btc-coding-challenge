package com.xyz.numbers;

public class FibonacciOfANum {

	public static void main(String[] args) {

		int n=10;
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		int str[]=new int[100];
		str[0]=a;
		str[1]=b;
		int len=2;
		
		for(int i=2;i<=n;i++ ) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+" ");
			str[len]=c;
			len++;
		}
		for(int i=1;i<len;i=i+1) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
	for(int i=0;i<len;i=i+2) {
		System.out.print(str[i]+" ");
	}
	}

}
