package org.xyz.practice;

import java.util.ArrayList;
import java.util.List;

public class List4 {

	public static void main(String[] args) {
		List<String> st1=new ArrayList<String>() ;
		st1.add("apple");
		st1.add("orange");
		st1.add("grapes");
		List<String> st2=new ArrayList<String>() ;
		st2.add("melon");
		st2.add("apple");
		st2.add("mango");
		List<String> newList=new ArrayList<String>() ;

		for (int i = 0; i < st1.size(); i++) {
			if(!st1.get(i).startsWith("a") || !st1.get(i).startsWith("g"))
			{
				newList.add(st1.get(i));
			}
		}
		for (int i = 0; i < st2.size(); i++) {
			if(!st2.get(i).endsWith("n") || !st2.get(i).endsWith("e"))
			{
				newList.add(st2.get(i));
			}
		}
		System.out.println(newList);
		
				
		

	}

}
