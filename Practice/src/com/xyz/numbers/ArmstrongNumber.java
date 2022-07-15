package com.xyz.numbers;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=153;
		boolean b=isArmstrongNumber(num);
		if(b==true) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

	private static boolean isArmstrongNumber(int num) {
		int sum=0;int t=num;
		int c=pow(num);
		do {
			int r=num%10;
			sum=sum +pow(r ,c);
			num=num/10;
			System.out.println(sum);
		}while(num>0);
	
		return t==sum;
	}

	private static int pow(int n, int p) {
		int pw=1;
		while(p>0)
		{
		pw=pw*n;
		p--;
		}
		return pw;
		
	}

	private static int pow(int num) {
		int count=0;
		do{
			count++;
			num=num/10;
			
		}while(num>0);
		System.out.println(count);
		return count;
	}

}
