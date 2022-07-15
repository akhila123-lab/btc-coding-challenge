package com.xyz.strings;

public class FirstWordCap {

	public static void main(String[] args) {
       String str="Hello to all of you";
       char c[]=str.toCharArray();
       for (int i = 0; i < str.length(); i++) {
		if(i==0 && str.charAt(i)!=' ' || str.charAt(i)!=' ' && str.charAt(i-1)==' ') {
			if(c[i]>='a' && c[i]<='z') {
				c[i]= (char) ((int)str.charAt(i)-32);
			}
		}
		else {
			if(c[i]>='A' && c[i]<='Z') {
				c[i]= (char) ((int)str.charAt(i)+32);
			}
		}
	}
       new String(c);
       System.out.println(c);
	}

}
