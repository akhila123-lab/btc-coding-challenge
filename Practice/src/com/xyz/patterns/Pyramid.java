package com.xyz.patterns;

public class Pyramid {

	public static void main(String[] args) {

		int n=5;
		
		for(int i=1;i<=5;i++) {
			for(int k=n-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
