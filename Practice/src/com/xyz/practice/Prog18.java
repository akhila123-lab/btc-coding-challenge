package com.xyz.practice;

public class Prog18 {

	public static void main(String[] args) {

		int a[]= {10,20,30,40};
		int num=30;
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
			if(a[i]==num) {
				break;
			}
		}
		System.out.println(count);
				
		int remove=count-1;
		int b[]=new int[a.length-1];
		for(int i=0;i<b.length;i++) {
			if(remove>i) {
				b[i]=a[i];
			}
			else 
				b[i]=a[i+1];
			}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
