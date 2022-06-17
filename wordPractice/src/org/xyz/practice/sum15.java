package org.xyz.practice;

public class sum15 {
	public static void main(String[] args) {
		int n=125;
		int res=1;
		do {
			int digit=n%10;
			res=res+res*digit;
			n=n/10;
		}while(n>0);
		System.out.println(res);
	}

}
