package org.btc.first;

import java.util.ArrayList;

public class MergeTwoArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(78);
		a1.add(8);
		a1.add(7);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(9);
		a2.add(4);
		a2.add(89);
		System.out.println(a1);
		System.out.println(a2);
		ArrayList<Integer> a3=new ArrayList<Integer>(a1);
		a3.get(a1.get(0));
		a3.get(a1.get(2));
		
		System.out.println(a3);
	}

}
