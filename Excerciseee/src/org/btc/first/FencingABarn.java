package org.btc.first;

import java.util.Scanner;

public class FencingABarn {
	   public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Select an option from list to calculate area of fence");
	        System.out.println("1. Square area for the chickens");
	        System.out.println("2. Circular area for ducks");
	        System.out.println("3. Rectangular area for cows");
	        int m= sc.nextInt();
	        switch (m)
	        {
	            case 1:
	                      System.out.println("entered side ");
	                      int sq=sc.nextInt();
	                      System.out.println("Area for chicken are: "+ sq * sq);
	                      break;
	            case 2: System.out.println("enter radius");
	                     int radius= sc.nextInt();
	                     System.out.println(3.14*radius*radius);
	                      break;
	            case 3: System.out.println("enter length and breadth");
	                    int length=sc.nextInt();
	                    int breadth= sc.nextInt();
	                    System.out.println(length*breadth);
	                      break;
	            default: return;

	        }

	    }
}
