package com.xyz.practice;

public class Prog19 {

	public static void main(String[] args) {

		int resultSum=0;
		String a[]= {"2AA","12","ABc","c9a"};
	    for(int i=0;i<a.length;i++) {
	    	int num=findNum(a[i]);
		  resultSum=resultSum+num;
	}
	    System.out.println(resultSum);
	}

	private static int findNum(String string) {
		char c[]=string.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0' && c[i]<='9') {
				sum= sum+(int) c[i]-48;
			}
		}
		return sum;
	}

}
