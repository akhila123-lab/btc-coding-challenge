package com.xyz.strings;

public class CountChars {

	public static void main(String[] args) {
     String str="hello to all of you yaah";
     int count =0;
     for (int i = 0; i < str.length(); i++) {
    	 if(str.charAt(i)!=' ')
    		 count ++;
		
	}
     System.out.println(count);
	}

}
