package com.xyz.arrays;

public class CombineTwoArrays {
public static void main(String[] args) {
	int a1[]= {1,2,3,4,5};
	int a2[]= {11,12,13,14,15};
	int a3[]=new int[a1.length+a2.length];
	for (int i = 0; i < a1.length; i++) {
		a3[i]=a1[i];
		
	}
	for (int i = 0; i < a2.length; i++) {
		a3[a1.length+i]=a2[i];
		
	}
	for(int i=0;i<a3.length;i++) {
		System.out.println(a3[i]);
	}
	
}

}
