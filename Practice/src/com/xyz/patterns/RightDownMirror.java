package com.xyz.patterns;

public class RightDownMirror {

	public static void main(String[] args) {

		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
