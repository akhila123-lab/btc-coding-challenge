package com.xyz.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Prog2 {
public static void main(String[] args) {

	 Map<String,String> map1=new HashMap<>();
	map1.put("ram", "hari");
	map1.put("cisco", "burfi");
	map1.put("cts", "hari");
	map1.put("honeywell", "cs");
	
	String value="hari";
	
//	String str[]=new String[10];
//	int len=0;

ArrayList<String> ar=new ArrayList<>();
	
	for(Entry<String,String> entry: map1.entrySet()) {
		if(entry.getValue().equals(value)) {
			//System.out.println(entry.getKey());
			ar.add(entry.getKey().toString());
			
		}
	}
        System.out.println(ar);

	}

}
