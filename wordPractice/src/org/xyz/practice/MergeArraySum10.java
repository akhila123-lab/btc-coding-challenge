package org.xyz.practice;

public class MergeArraySum10 {

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4};
		int ar2[]= {7,4,3,5};
		int sum=0;
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if(ar1[i]==ar2[j]) 
					sum=sum+ar1[i];
				
			}
	
		}
    System.out.println(sum);
	}

}
