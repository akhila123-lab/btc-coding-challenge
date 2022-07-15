package com.xyz.numbers;

public class PrimeOrNot {

	public static void main(String[] args) {

		int n=5;
		boolean b=isPrime(n);
		if(b) {
			System.out.println("prime");
		}
		else
			System.out.println("not prime");

	}

	private static boolean isPrime(int n) {

		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
