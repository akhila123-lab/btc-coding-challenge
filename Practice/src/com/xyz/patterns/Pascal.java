package com.xyz.patterns;

public class Pascal {
	public static void main(String[] args) {
		int n=5;
		int spaces=n;
		for(int i=0;i<n;i++) {
			
			System.out.println("hello");
			int number=1;
			for(int j=0;j<spaces;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(number+" ");
				number=number*(i-k)/(k+1);
		
			
			}
			System.out.println();
			spaces--;		

	}
	
	}
}
