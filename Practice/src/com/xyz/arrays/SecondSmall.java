package com.xyz.arrays;

public class SecondSmall {
	public static void main(String[] args) {
		int a[]= {13,2,3,4,24,652,1,2,7};
		int small=a[0];
		int secSmall=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
			if(a[i]<secSmall && a[i]>small) {
				secSmall=a[i];
			}
		
		}
		System.out.println("second small "+secSmall);
	}

}
