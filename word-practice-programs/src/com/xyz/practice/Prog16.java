package com.xyz.practice;

public class Prog16 {

	public static void main(String[] args) {
		String str="medam";
		boolean b=isPalindrome(str);
		char c[]=str.toCharArray();
		char voewl[]= {'a','e','i','o','u'};
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<voewl.length;j++) {
				for(int k=1;k<voewl.length;k++) {
					if(b== true && c[i]==voewl[j] && c[i] == voewl[k]) {
						System.out.println("two different vowels");
						break;
						
						
					}
					else
					{
						System.out.println("no two different vowels");
						break;
					}
		
				}
			}
		}
		
	}
	private static boolean isPalindrome(String str) {
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		
		return rev.equals(str);
	}
	
}
