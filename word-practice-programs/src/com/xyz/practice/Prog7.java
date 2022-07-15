package com.xyz.practice;

import java.util.HashMap;

public class Prog7 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> h1= new HashMap<>();
		h1.put(1, 50);
		h1.put(2, 70);
		h1.put(3, 150);
		h1.put(4, 90);
		h1.put(5, 100);
		int count =0;
		int sum=0;
		for(int i: h1.keySet()) {
			
			if(i%2!=0) {
				count++;
				sum=sum+ h1.get(i);
			}
		}
		System.out.println(sum/count);

	}

}
