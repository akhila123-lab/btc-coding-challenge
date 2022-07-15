package com.xyz.arrays;

public class CountPalindrome {

	public static void main(String[] args) {
 
		int a[]= {121,23,676,909,99,56,7689};
		int count=0;
		System.out.println("ghjk");
		for (int i = 0; i < a.length; i++) {
			boolean b=countPalin(a[i]);
			if(b==true) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean countPalin(int i) {
		int k=i,rev=0;
		do {
			int digit=i%10;
			rev=rev*10+digit;
			i=i/10;
		}while(i!=0);

		
		
		return k==rev;
	}
	

}
