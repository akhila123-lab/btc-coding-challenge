package org.xyz.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstThreeLettersCapital1 {
static	Map<String, String> map=new HashMap<String, String>();
	public static void main(String[] args) {
		String str[]={"goa","kerala","gujarat"} ;
		FirstThreeLettersCapital1.capital(str);
		}

	private static void capital(String[] str) {
		
		for (int i = 0; i < str.length; i++) {
			String first=str[i].substring(0,3).toUpperCase();
			String last=str[i];
			map.put(first,last);
		}
System.out.println(map);
	}

}
