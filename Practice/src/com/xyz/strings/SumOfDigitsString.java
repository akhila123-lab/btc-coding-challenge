package com.xyz.strings;

import java.util.Iterator;

public class SumOfDigitsString {

	public static void main(String[] args) {
      String str="hello9 t8o 2all1";
      int sum=0;
      for (int i = 0; i < str.length(); i++) {
    	  if(str.charAt(i)>='0' && str.charAt(i)<='9')
    	  {
    		  sum=sum+str.charAt(i)-48;
    	  }
		
	}
      System.out.println(sum);

	}

}
