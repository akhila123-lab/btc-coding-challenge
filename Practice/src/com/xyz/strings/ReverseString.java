package com.xyz.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str="hello to all";
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		System.out.println(str);
		System.out.println(rev);

	}
}
