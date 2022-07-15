package com.xyz.strings;

public class CountWords {

	public static void main(String[] args) {
		String str="hello to all of you";
		int cout=0;
		for (int i = 0; i < str.length(); i++) {
			if(i==0 && str.charAt(i)!=' ' || str.charAt(i)!=' ' && str.charAt(i-1)==' ') {
				cout++;
			}
			
		}
		System.out.println(cout);

	}

}
