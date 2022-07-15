package com.xyz.strings;

public class LargeWordSmall {
	public static void main(String[] args) {
	String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
//    String word = "", small = "", large="";    
//    String[] words = new String[100];    
//    int length = 0;    
//        
//    //Add extra space after string to get the last word in the given string    
//    string = string + " ";    
//        
//    for(int i = 0; i < string.length(); i++){    
//        //Split the string into words    
//        if(string.charAt(i) != ' '){    
//            word = word + string.charAt(i);    
//        }    
//        else{    
//            //Add word to array words    
//            words[length] = word;    
//            //Increment length    
//            length++;    
//            //Make word an empty string    
//            word = "";    
//        }    
//    }            
//    //Initialize small and large with first word in the string    
//    small = large = words[0];    
//        
//    //Determine smallest and largest word in the string    
//    for(int k = 0; k < length; k++){    
//            
//        //If length of small is greater than any word present in the string    
//        //Store value of word into small    
//        if(small.length() > words[k].length())    
//            small = words[k];    
// 
//        //If length of large is less than any word present in the string    
//        //Store value of word into large    
//        if(large.length() < words[k].length())    
//            large = words[k];    
//    }    
//    System.out.println("Smallest word: " + small);    
//    System.out.println("Largest word: " + large); 
	
	
	//string=string+" ";
	String words[]=new String[100];
	String word="",small="",large="";
	int len=0;
	
	for (int i = 0; i < string.length(); i++) {
		
			if(i==0 && string.charAt(i)!=' ' || string.charAt(i)!=' ') {
				word=word+string.charAt(i);
			}
			else {
				words[len]=word;
			len++;
			word="";
		}
		
	}
	

	small=large=words[0];
	for (int i = 0; i < len; i++) {
		if(small.length()>words[i].length()) {
			small=words[i];
		}
	 if(large.length()<words[i].length()) {
			large=words[i];
		}
	}
	System.out.println(large);
	System.out.println(small);

	
} 

}
