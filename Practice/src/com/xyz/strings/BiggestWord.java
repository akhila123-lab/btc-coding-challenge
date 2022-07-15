package com.xyz.strings;

public class BiggestWord {

	public static void main(String[] args) {
		String str="Hello to alllllllllllll of you guysssssss";
		String str1[]=str.split("\\s");
		String low="";
		String high=low=str1[0];
		for (int i = 0; i < str1.length; i++) {
			if(str1[i].length()>high.length()) {
				high=str1[i];
			}
			else if(str1[i].length()<low.length())
			{
				low=str1[i];
			}
		}
		System.out.println(high);
		System.out.println(low);
		
//		char c[]=str.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			if(i==0 && c[i]!=' ' || c[i]!=' ' && c[i-1]==' ') {
//				
//			}
//		}

	}

}
