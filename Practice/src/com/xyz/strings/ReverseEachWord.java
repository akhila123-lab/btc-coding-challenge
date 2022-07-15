package com.xyz.strings;

public class ReverseEachWord {

	public static void main(String[] args) {
     String str="Hello to all of you";
     char c[]=str.toCharArray();
     String rs="";
     for (int i = 0; i < c.length; i++) {
    	 int k=i;
    	 while(i<c.length &&c[i]!=' ' ) {
    		 i++;
    	 }
    	 int j=i-1;
    	 while(j>=k) {
    		 rs=rs+c[j];
    		 j--;
    	 }
    	 if(i<c.length) {
    		 rs=rs+c[i];
    	 }
		
	}
     str=new String(rs);
     System.out.println(str);
     
	}

}
