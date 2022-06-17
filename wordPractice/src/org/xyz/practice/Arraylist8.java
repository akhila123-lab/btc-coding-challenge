package org.xyz.practice;

import java.util.ArrayList;

public class Arraylist8 {

	public static void main(String[] args) {
      ArrayList< Integer> al1=new ArrayList<Integer>();
      al1.add(1);
      al1.add(2);
      al1.add(3);
      al1.add(4);
      al1.add(5);
      ArrayList< Integer> al2=new ArrayList<Integer>();
      al2.add(6);
      al2.add(7);
      al2.add(8);
      al2.add(9);
      al2.add(10);
      ArrayList< Integer> al3=new ArrayList<Integer>();
     
      for(int i=0;i<al2.size();i=i+2)
      {
    	
    	  int k=1;
    	  al3.add(al2.get(i));
    	  al3.add(al1.get(k));
    	  k=k+2;
    	 
      }
      System.out.println(al3);
		
	
	}

}
