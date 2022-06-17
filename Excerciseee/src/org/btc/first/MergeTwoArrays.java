package org.btc.first;

public class MergeTwoArrays {

	public static void main(String[] args) {
      int a1[]= {1,2,3,4};
      int a2[]= {3,4,5,6};
      
      int count=0;
      for(int i=0;i<a1.length;i++)
      {
    	  for(int j=0;j<a2.length;j++)
    	  {
    		  if(a1[i]==a2[j]) {
    		     count=count+a1[i];  
    		     System.out.print(a1[i]+"  "+"\n");
    		  }  
    	  }

      }
      System.out.println("the intersection of values are : "+count);
     
	}

}
