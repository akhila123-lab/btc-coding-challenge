package com.xyz.arrays;

public class CountPrimes {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,11,13};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			
		
		boolean b=isPrime(a[i]);
		if(b==false) {
			count++;
		}
		}
		System.out.println(count);
	}

	private static boolean isPrime(int i) {
		
		for (int j = 2; j <= i/2 ; j++) {
			if(i%j==0) {
				System.out.println("nums "+i);
				return true;
			}
		}
		return false;
	}

}
