package com.xyz.arrays;

public class DuplicateElements {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,1,2,34,4,56,7,1,1,1,1};
		boolean b[]=new boolean[a.length];
		int a1[]=new int[a.length];
		int len=0;
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count>1) {
				System.out.println(a[i]+"--->"+count);
				}
				else {
					a1[len]=a[i];
				len++;
				}
			}
			
		}
		for(int i=0;i<len;i++) {
			System.out.println(a1[i]);
		}
		
		
	}

}
