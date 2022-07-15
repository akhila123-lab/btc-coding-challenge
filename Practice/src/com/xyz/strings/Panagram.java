package com.xyz.strings;

public class Panagram {
	
	public static void main(String[] args) {
		String str="abcdefghijklm nopqrst uvwxyz";
		boolean b=isPanagram(str);
		System.out.println(b);
		if(b) {
			System.out.println("panagram");
		}else
		System.out.println("not panagram");
	}
	private static boolean isPanagram(String str) {
		int count[]=new int[26];
		if(str.length()<26) {
			System.out.println("length");
         return false;}

			for (int i = 0; i < str.length(); i++) {
				char c=str.charAt(i);
				if(c>='a' && c<='z') {
					count[c-97]++;
				}
				else if(c>='A' && c<='Z') {
					count[c-65]++;
				}
				
			}
		
		for (int i = 0; i < 26; i++) {
			if(count[i]==0) 
				return false;
			}
			return true;

	}
}
		
	


