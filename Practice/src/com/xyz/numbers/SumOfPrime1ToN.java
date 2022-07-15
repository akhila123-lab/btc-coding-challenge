package com.xyz.numbers;

public class SumOfPrime1ToN {

	public static void main(String[] args) {

		int n=10;
		int sum=0;
		for(int i=2;i<=n;i++) {
			
			boolean b=isPrime(i);
			if(b) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int i) {
		for(int j=2;j<=i/2;j++) {
			if(i%j==0)
			{
				return false;
			}
		}
		return true;
	}

}
