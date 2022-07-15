package com.xyz.strings;

public class Palindrome {
public static void main(String[] args) {
	String str="madam";
	String rev="";
	for (int i = 0; i < str.length(); i++) {
		rev=str.charAt(i)+rev;
	}
	if(str.equals(rev)) {
		System.out.println(rev);
		System.out.println("palindrome");
	}
	else {
		System.out.println(rev);
		System.out.println("not palindrome");
	}
}
}
