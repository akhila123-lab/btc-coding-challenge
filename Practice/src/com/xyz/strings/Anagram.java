package com.xyz.strings;

public class Anagram {
	public static void main(String[] args) {
		String str1="madam";
		String str2="mdaam";
		boolean b=isAnagram(str1,str2);
		System.out.println(b);
		if(b) {
			System.out.println("anagram");
		}else
		System.out.println("not anagram");
	}

	private static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		int count1[]=new int[26];
		for (int i = 0; i < str1.length(); i++) {
			char c=str1.charAt(i);
			if(c>='a' && c<='z') {
				count1[c-97]++;
			}
			else if(c>='A' && c<='Z') {
				count1[c-65]++;
			}
			
		}
		int count2[]=new int[26];
		for (int i = 0; i < str2.length(); i++) {
			char c=str2.charAt(i);
			if(c>='a' && c<='z') {
				count2[c-97]++;
			}
			else if(c>='A' && c<='Z') {
				count2[c-65]++;
			}
			
		}
		for (int i = 0; i < count2.length; i++) {
			if(count1[i]==count2[i]) {
				return true;
			}
			
		}
		
		return false;
	}

}
