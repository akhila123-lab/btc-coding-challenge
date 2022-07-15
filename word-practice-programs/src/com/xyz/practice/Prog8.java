package com.xyz.practice;

import java.util.ArrayList;
import java.util.List;

public class Prog8 {

	public static void main(String[] args) {
	    List<Integer> results = new ArrayList<Integer>();

			ArrayList<Integer> a1=new ArrayList<>();
			a1.add(1);
			a1.add(2);
			a1.add(3);
			a1.add(4);
			a1.add(5);
			ArrayList<Integer> a2=new ArrayList<>();
			a2.add(6);
			a2.add(7);
			a2.add(8);
			a2.add(9);
			a2.add(10);
			int j=0;
			
			for(int i=1;i<=a1.size() && j<= a2.size();i=i+2) {
			  results.add(a2.get(j));
			  if(i==a1.size()) { break;}
			  results.add(a1.get(i));
			  j=j+2;
			  
					
				}
			System.out.println(results);
			}
			
	}


