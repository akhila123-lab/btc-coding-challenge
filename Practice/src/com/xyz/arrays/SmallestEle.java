package com.xyz.arrays;

public class SmallestEle {

	public static void main(String[] args) {
	int a[]= {1,2,34,52,1554};
	//int small=a[0];
	int large=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]>large)
			large=a[i];
	}
	System.out.println(large);

	}

}
