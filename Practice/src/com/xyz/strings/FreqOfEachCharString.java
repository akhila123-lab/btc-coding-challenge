package com.xyz.strings;

public class FreqOfEachCharString {

	public static void main(String[] args) {
	      String str="hello to 2all1";
//	    
//	      char c[]=str.toCharArray();
//	      for (int i = 0; i < str.length(); i++) {
//	    	  int count=0;
//	    	  for(int j=i+1;j<str.length();j++) {
//	    	  if(str.charAt(i)==c[j]) {
//	    		  count++;
//	    	  c[j]='@';
//	    	  }
//	    	  }
//	    	  if(count>0)
//		      System.out.println(str.charAt(i)+" is repeated "+count);
//
//			
//		}
	      
	      int count[]=new int[128];
	      for (int i = 0; i < str.length(); i++) {
	    	  char c=str.charAt(i);
	    	  count[c]++;
			}
	      for (int i = 0; i < count.length; i++) {
			if(count[i]!=0)
			{
				System.out.println((char)i+" "+count[i]);
			}
		}
	      }
	     

		}

