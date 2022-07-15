package com.xyz.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class Prog6 {

	public static void main(String[] args) {

		HashMap<String,Integer> h1= new HashMap<>();
		h1.put("abc", 50);
		h1.put("efg", 70);
		h1.put("abc1", 390);
		h1.put("efg2", 90);

		HashMap<String,String> h2= new HashMap<>();
		
		for(Entry<String,Integer> str: h1.entrySet()) {

		//int v=str.getValue();
		if(str.getValue()<60) {
			h2.put(str.getKey(), "fail");
		}
		else {
			h2.put(str.getKey(), "pass");
		}
		}
		System.out.println(h2);
	
	}

}
