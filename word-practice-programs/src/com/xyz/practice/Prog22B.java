package com.xyz.practice;

public class Prog22B {

	public static void main(String[] args) {

		String str="helloworld";
		
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]='1';
					break;
					
				}
			}
			System.out.print(ch[i]);
		}
//		int count[]=new int[26];
//		char ch[]=str.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			count[ch[i]-97]++;
//		}
//		for(int i=0;i<count.length;i++) {
//			if(count[i]>0) {
//			System.out.print((char)(i+97) );	
//			}
//		}
//		
	}

}
