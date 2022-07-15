package com.xyz.strings;

import java.util.Iterator;

public class ConvertVowelCapRemSmall {

	public static void main(String[] args) {
     String str="Hello to all of you";
     char c[]=str.toCharArray();
     for (int i = 0; i < c.length; i++) {
		if(c[i]>='a' && c[i]<='z') {
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') {
				c[i]=(char)((int)c[i]-32);
			}
		
		}
		else if(c[i]>='A' && c[i]<='Z') {
			if(c[i]!='A' || c[i]!='E' || c[i]!='I' || c[i]!='O' || c[i]!='U') {
				c[i]=(char)((int)c[i]+32);
			}
		
		}
	}
     str=new String(c);
     System.out.println(str);
	}

}
