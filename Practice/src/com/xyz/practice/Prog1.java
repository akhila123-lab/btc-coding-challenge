package com.xyz.practice;

import java.util.HashMap;
import java.util.Map;

public class Prog1 {

	static Map<String,String> map=new HashMap<>();
	public static void main(String[] args) {
		
		String str[]= {"goa","kerala","Gujarat"};
		printFirstThreeCaps(str);
		

	}
	public static void printFirstThreeCaps(String str[]) {
		for(int i=0;i<str.length;i++) {
			String k=str[i].substring(0,3).toUpperCase();
			String value=str[i];
			
			map.put(k, value);
			
			
		}
//		map.forEach((k,v)->System.out.println(k+" "+v));
	
//	for(String s:map.keySet()) {
//		System.out.println(s+" "+map.get(s));
		System.out.println(map);
	}
	}

