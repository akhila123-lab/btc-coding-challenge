package com.xyz.arrays;

public class FindNEle {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8};
		int n=3;
		for(int i=0;i<a.length;i++) {
			int temp=a[0];
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[n-1]);

	}

}
