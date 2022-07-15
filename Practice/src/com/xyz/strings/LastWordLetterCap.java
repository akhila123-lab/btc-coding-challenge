package com.xyz.strings;

public class LastWordLetterCap {

	public static void main(String[] args) {
     String str="Hello to all of you";
     char c[]=str.toCharArray();
     for (int i = 0; i < c.length; i++) {
		 
    	 if(i==c.length-1 && c[i]!=' ' || c[i+1]==' ' && c[i]!=' ') {
    		 if(c[i]>='a' && c[i]<='z') {
    			c[i]= (char) ((int)c[i]-32);
    		 }
    	 }
    	 else
    		 if(c[i]>='A' && c[i]<='Z') {
     			c[i]= (char) ((int)c[i]+32);
     		 }
	}
    str= new String(c);
    
     System.out.println(str);
	}

}
