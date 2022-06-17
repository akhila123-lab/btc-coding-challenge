package org.xyz.practice;

import java.util.HashMap;
import java.util.Map;

public class AverageMarks14 {
	public static void main(String[] args) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(12,90);
		map.put(35,90);
		map.put(33,90);
		map.put(50,88);
		map.put(51,88);

		//System.out.println(map);
		int total=0;
		int count=0;
		for(Integer values:map.keySet())
		{
			if(values%2!=0)
			{
				total=total+map.get(values);
				count++;
				
			}
		}
	
		System.out.println(total/count);
		
	}

}
