package com.xyz.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class SortAnArray {
	public static void main(String[] args) {
		int a[]= {1,32,2,45,3,98};
//		for(int i=0;i<a.length;i++) {
//			int temp=0;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//					
//				}
//			}
//		}
		Arrays.sort(a);
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
	}

}
