package com.xyz.practice;

import java.util.ArrayList;
import java.util.List;

public class Prog3 {

	public static void main(String[] args) {

	    List<Integer> results = new ArrayList<Integer>();

		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(7);
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(1);
		a2.add(2);
		a2.add(9);
		a2.add(5);
		a2.add(7);
		
		System.out.println("hello");

		for(int i=0;i<a1.size();i++) {
			boolean contains=false;
			for(int j=0;j<a2.size();j++) {
			if(a1.get(i)==a2.get(j)) {
              contains=true;
				break;
			}

		}
			if(contains==false) {
				results.add(a1.get(i));
				results.add(a2.get(i));
			}
		}

		System.out.println(results);

	}

}
