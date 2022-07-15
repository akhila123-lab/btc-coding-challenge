package com.xyz.strings;

import java.util.Iterator;

public class LowerCaseConv {
	public static void main(String[] args) {
	String str="hello To ALl OF YOU";
	char c[]=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		
		if(c[i]>='A' && c[i]<='Z') {
			c[i]=(char)(c[i]+32);
		}
	
	}
	 String str1=new String(c);
	 System.out.println(str1);
	
}
}