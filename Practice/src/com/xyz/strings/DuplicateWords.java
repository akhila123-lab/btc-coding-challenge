package com.xyz.strings;

public class DuplicateWords {

	public static void main(String[] args) {
    String str="hello to all of you to all to all of you all all all";
    str=str+" ";
    String words[]=new String[100];
    int len=0;
    String word="";
    for (int i = 0; i < str.length(); i++) {
    	if(str.charAt(i)!=' ')
    	{
    		word=word+str.charAt(i);
    	}
    	else {
    		words[len]=word;
    		len++;
    		word="";
    	}
		
	}
//    for (int i = 0; i < len; i++) {
//        System.out.println(words[i]);
//
//	}
    for (int i = 0; i < len; i++) {
    	int count=0;
    	for (int j = i+1; j < len; j++) {
    		if(words[i].equals(words[j])) {
    			count++;
    			words[j]="0";
    		}
			
		}
    	if(count>0 && words[i]!="0") {
    		System.out.println("duplicates are: "+words[i]+" count "+count);
    	}
		
	}
	}

}
