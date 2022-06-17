package org.xyz.practice;

import java.util.ArrayList;
import java.util.List;

public class Arrayss3 {
	public static void main(String[] args) {
		int[] Array1 = new int[] {1,2,3,4};
	    int[] Array2 = new int[] {1,2,3,5};
	    boolean contains = false;
	    List<Integer> results = new ArrayList<Integer>();


	    for(int i=0; i<Array1.length; i++) {
	        for(int j=0; j<Array2.length; j++) {
	            if(Array1[i]==Array2[j]) {
	                contains = true;
	                break;
	            }
	        }
	        if(!contains) {
	            results.add(Array1[i]);
	            results.add(Array2[i]);
	        }
	    }
  System.out.println(results);	


}
}
