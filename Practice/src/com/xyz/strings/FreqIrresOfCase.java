package com.xyz.strings;

import java.util.Iterator;

public class FreqIrresOfCase {
public static void main(String[] args) {
	String str="HEllo TO AlL oF YoUya";
	int count[]=new int[26];
	for (int i = 0; i < str.length(); i++) {
		char c=str.charAt(i);
		 if(c>='A' && c<='Z')
				count[c-65]++;
	
		 else if(c>='a' && c<='z')
		count[c-97]++;
		
		
	}
	for (int i = 0; i < count.length; i++) {
		if(count[i]>0) {
			System.out.println((char)(i+65)+" "+count[i]);
			                         }
	}
		
	
}
}
