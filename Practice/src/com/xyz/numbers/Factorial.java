package com.xyz.numbers;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int fact=1;
			for(int j=i;j>=1;j--) {
				fact=fact*j;
			} 
			System.out.println("fact "+i+" is "+fact);
		}
	}
}
