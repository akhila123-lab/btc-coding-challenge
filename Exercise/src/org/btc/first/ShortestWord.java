package org.btc.first;

public class ShortestWord {
	 public static void main(String[] args) {
	        String words[] = {"Atrocity", "Pensive", "Imperceptible", "Discordant"};
	      String smallest = words[0];
	            for (int k = 1; k < words.length; k++) {
	                if (words[k].length() < smallest.length()) {
	                    smallest = words[k];
	                }

	            }
	        System.out.println(smallest);
	        }
}
