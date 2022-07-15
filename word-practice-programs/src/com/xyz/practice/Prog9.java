package com.xyz.practice;

public class Prog9 {

	public static void main(String[] args) {
		int n=3;

		String str[]= {"red","green","blue","ivory"};
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].compareTo(str[j])>0) {
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		String str1[]=new String[str.length];
		int len=0;
		
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
			str1[len]=str[i];
			len++;
			
		}
		
		System.out.println();
		System.out.println(str1[n-1]);
		

}
}
