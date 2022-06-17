package org.xyz.practice;

public class String33 {

	public static void main(String[] args) {
     String str="this was great";
     System.out.println(find(str));
    

	}

	private static int find(String str) {
		char first=str.charAt(0);
	     char last=str.charAt(str.length()-1);
	     if(first==last) {
	    	 return 1;
	     }
	     else 
	    	 return -1;
		
	}

}
