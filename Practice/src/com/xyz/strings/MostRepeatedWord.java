package com.xyz.strings;

import java.util.ArrayList;

public class MostRepeatedWord {

	public static void main(String[] args) {
		String str="hello to all of you to this occassion occassion occassion occassion occassion occassion occassion occassion of hello all to to all to";
		String words[]=str.split("\\s");
		String word="";
		int maxcount=0;
		for (int i = 0; i < words.length; i++) {
			int count=0;
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				word=words[i];
			}
		}
		System.out.println(word);
		
		
		
//		 String line, word = "";    
//	        int count = 0, maxCount = 0;    
//	        ArrayList<String> words = new ArrayList<String>();    
//System.out.println("------");
//	        while(str != null) {    
//	            String string[] = str.split("\\s");    
//	            //Adding all words generated in previous step into words    
//	            for(String s : string){    
//	                words.add(s);    
//	            }    
//	        }
//	        System.out.println(words);
//	        for(int i = 0; i < words.size(); i++){    
//	            count = 1;    
//	            //Count each word in the file and store it in variable count    
//	            for(int j = i+1; j < words.size(); j++){    
//	                if(words.get(i).equals(words.get(j))){    
//	                    count++;    
//	                }     
//	            }    
//	            //If maxCount is less than count then store value of count in maxCount     
//	            //and corresponding word to variable word    
//	            if(count > maxCount){    
//	                maxCount = count;    
//	                word = words.get(i);    
//	            }    
//	        }    
//	            
//	        System.out.println("Most repeated word: " + word);    
//	           
	    }    
	}

