package org.btc.first;

public class Palindrome {
	public static void main(String[] args) {
        String words []= {"Hannah", "Texas", "Renner", "Eleele" };
        int count=0;
                for (int i=0;i<words.length;i++)
                {
                    String rev="";
                    String temp=words[i].toLowerCase();
                    for (int j=words[i].length()-1;j>=0;j--)
                    {
                        rev=rev+words[i].charAt(j);
                    }
                    rev=rev.toLowerCase();
                    if(temp.equals(rev))
                    {
                        System.out.println(words[i]+" is a palindrome");
                        count++;
                    }

                }
                System.out.println("the total numbers of Palindromes are:"+ count);
    }
}
