package com.xyz.numbers;

public class PerfectNumber1ToN {

	public static void main(String[] args) {

		int n=100;
		for(int i=1;i<=n;i++) {
			boolean b=isPerfect(i);
			if(b==true) {
				System.out.println(i);
			}
		}
		
	}

	private static boolean isPerfect(int x) {
		int sum=0;
      for(int i=1;i<x;i++)
      {
    	  if(x%i==0) {
    		  sum=sum+i;
    	  }
      }
		if(sum==x)
			return true;
	
	else 
		return false;
	}

}
