package com.xyz.strings;

public class FirstCharSmallRemCap {

	public static void main(String[] args) {
     String str="hello to all OF YOU YahOO";
     char c[]=str.toCharArray();
     for (int i = 0; i < c.length; i++) {
    	 if(i==0 && c[i]!=' ' || c[i]!=' ' && c[i-1]==' ') {
    		 if(c[i]>='A' && c[i]<='Z') {
    		 c[i]=(char) ((int)c[i]+32);}
    	 }
    	 else {
    	 if(c[i]>='a' && c[i]<='z')
    		 c[i]=(char) ((int)c[i]-32); 
    	 }
	}
     str=new String(c);
     System.out.println(str);
	}

}
