package com.xyz.practice;

public class Prog5 {

	public static void main(String[] args) {

		String str="Hello*WSorld";
		boolean rs=find(str);
		System.out.println(rs);
		
	}

	private static boolean find(String str) {
		int count=1;
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			if(c[i]=='*') {
				break;
			}
			count++;
		}
		int place=count-1;
		System.out.println(c[place-1]);
		System.out.println(c[place+1]);
		if(c[place-1] == c[place+1]) {
			
			return true;
		}
		else 
			return false;

		
	}

}
