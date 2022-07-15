package com.xyz.strings;

public class SwapFirstCharLastChar {
	public static void main(String[] args) {
		String str="Hello to all of you";
		char c[]=str.toCharArray();
		int f=0;
		for (int i = 0; i < c.length; i++) {
			
			//finding first char of word
			if(i==0 && c[i]!=' ' || c[i]!=' ' && c[i-1]==' ') {
				f=i;
			}
			
			//finding last char of a word
			else if(i==c.length-1 && c[i]!=' ' || c[i]!=' ' && c[i+1]==' ') {
				char temp=c[i];
				c[i]=c[f];
				c[f]=temp;
			}
			
		}
		str=new String(c);
		System.out.println(str);
		}

}
