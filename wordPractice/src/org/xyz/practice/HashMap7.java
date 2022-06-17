package org.xyz.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMap7 {
public static void main(String[] args) {
	Map<Integer, Integer> in=new HashMap<Integer, Integer>();
	in.put(1,4);
	in.put(2,6);
	in.put(4,7);
	in.put(7,9);
	int sum=0;
	int count=0;
	for(Integer i:in.keySet())
	{
		
		if(i%2!=0)
		{
			sum=sum+in.get(i);
			count++;
		}
	}
	System.out.println("the average of the odd numbers are: ");
	System.out.println((float)sum/count);
	}
}
