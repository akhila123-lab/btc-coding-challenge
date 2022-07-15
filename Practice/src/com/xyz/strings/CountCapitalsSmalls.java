package com.xyz.strings;

public class CountCapitalsSmalls {
	
	public static void main(String[] args) {
		String str="hellow TO AlL of YoU";
		int oc=0,ev=0;
		int vowelCount=0,cC=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' )
						{
					vowelCount++;
						}
				else
					cC++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
						{
					vowelCount++;
						}
				else 
					cC++;
			}
				
		}
		System.out.println("ovwel "+ vowelCount);
		System.out.println("consonent "+ cC);

	}

}
