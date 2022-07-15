package com.xyz.practice;

import java.util.ArrayList;
import java.util.List;

public class Prog4 {

	public static void main(String[] args) {

		List<String> a1=new ArrayList<String>();
		a1.add("apple");
		a1.add("orange");
		a1.add("grape");
		
		List<String> a2=new ArrayList<String>();
		a2.add("melon");
		a2.add("apple");
		a2.add("mango");
		
		List<String> res= new ArrayList<String>();
		
		for (int i = 0; i < a1.size(); i++) {
			if(!a1.get(i).startsWith("a") || !a1.get(i).startsWith("g"))
			{
				res.add(a1.get(i));
			}
		}
		for (int i = 0; i < a2.size(); i++) {
			if(!a2.get(i).endsWith("n") || !a2.get(i).endsWith("e"))
			{
				res.add(a2.get(i));
			}
		}
		System.out.println(res);

}
}