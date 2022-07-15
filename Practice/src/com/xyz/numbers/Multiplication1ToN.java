package com.xyz.numbers;

public class Multiplication1ToN {

	public static void main(String[] args) {

		int n=10;
		for(int i=1;i<=n;i++) {
			int mul=0;
			for(int j=1;j<=10;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			System.out.println();
		}
	}

}
