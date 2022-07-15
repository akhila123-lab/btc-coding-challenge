package com.xyz.strings;

public class ReverseSentWords {
	public static void main(String[] args) {
		String str="hello to all of you";
		String rs="";
		char c[]=str.toCharArray();
		for (int i = c.length-1 ; i >= 0; i--) {
			
			int k=i;
			while(i>=0 && c[i]!=' ') {
				i--;
			}
			int j=i+1;
			while(j<=k) {
				rs=rs+c[j];
				j++;
			}
			if(i>=0) {
				rs=rs+c[i];
			}
			
		}
		str=new String(rs);
		System.out.println(str);
	}

}
