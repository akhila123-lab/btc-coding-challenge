package com.xyz.numbers;

public class Prime1ToN {

	public static void main(String[] args) {

		int n=100;int count=0;
		for(int i=1;i<n;i++) {
			
			for(int j=2;j<=i/2;j++) {
//				if(i%j==0) 
//					
//					count++;
//			}
//			if(count==0) {
//				System.out.print(i+" ");
//			}
				if(i%j!=0) {
					count++;
				}
		}
			System.out.println(count);
		}
		System.out.println("2nd "+count);
	}
}


