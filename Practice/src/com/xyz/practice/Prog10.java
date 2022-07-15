package com.xyz.practice;

public class Prog10 {

	public static void main(String[] args) {


		int a1[]= {1,2,3,4};
		int a2[]= {3,4,5,6};
		boolean b[]=new boolean[a1.length];
		int a3[]=new int[a1.length];
		int len=0;
		int sum=0;
		for(int i=0;i<a1.length;i++) {
			if(b[i]==false) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
				
					b[j]=true;
					System.out.println("values"+a1[i]);
					a3[len]=a1[i];
					len++;
				}
				
			}
			
			}
			}
		for(int k=0;k<len;k++) {
			sum=sum+a3[k];
			
		}
		System.out.println(sum);
	}

}
