package org.btc.first;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		String array[]={"red","green","blue","ivory"};
		System.out.println("before sorting");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		// sorting the string array
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].compareTo(array[j])>0) {
					String temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("reverse order");
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int n=sc.nextInt();
		System.out.println();
		System.out.println(array[n-1]);
	}

}
