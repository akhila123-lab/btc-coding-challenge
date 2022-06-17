package org.xyz.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Markss6 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("abc",50);
		map.put("bca",37);
		map.put("dca",27);
		map.put("mca",77);

		Map<String, String> map1=new HashMap<String, String>();
		for(Entry<String, Integer> entry: map.entrySet())
		{
			if(entry.getValue()>=50)
			{
				map1.put(entry.getKey(),"pass");
			}
			else
				map1.put(entry.getKey(),"fail");
				
		}
		System.out.println(map1);
		
	}


}
