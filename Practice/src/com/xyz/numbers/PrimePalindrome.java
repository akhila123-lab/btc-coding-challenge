package com.xyz.numbers;

public class PrimePalindrome {

	public static void main(String[] args) {

		int n=1012;
		int rev=0;
		int t=n;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
			
		}while(n!=0);
		if(rev==t) {
			for(int i=2;i<=t/2;i++) {
				if(t%i==0) {
					System.out.println("palindrome and but not prime");
					break;

				}
			
			else
				System.out.println("palindrome and prime");
				break;
			}

				
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
