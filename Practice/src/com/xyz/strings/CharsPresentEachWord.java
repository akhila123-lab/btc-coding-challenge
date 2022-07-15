package com.xyz.strings;

public class CharsPresentEachWord {

	public static void main(String[] args) {
    String str="Hello to all of you";
    char c[]=str.toCharArray();
    for (int i = 0; i < c.length; i++) {
    	String rs="";
		while(i<c.length && c[i]!=' ') {
			rs=rs+c[i];
			i++;
		}
		if(rs.length()>0) {
			System.out.println(rs+"--->"+rs.length());
		}
	}
	}

}
