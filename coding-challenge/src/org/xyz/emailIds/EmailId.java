package org.xyz.emailIds;
import java.util.*;
public class EmailId {
	public static void main(String[] args) {
		
	
	String[] emailIds = { "albert.eisntein@gmail.com",
	                 "jagadish_chandra_bose@yahoo.com",
	                 "srinivasa.ramanujan@gmail.com", "bjarne_stroustrup@yahoo.com", "max.planck@gmail.com",
	                 "nikola.tesla@hotmail.com", "galileo_galilei@hotmail.com", "a.p.j.abdul.kalam@gmail.com",
	                 "richard.stallman@inbox.com", "john_von_neumann@mail.com", "c_v_raman@yahoo.com",
	                 "isaac.newton@yandex.com", "s_chandrashekar@hotmail.com", "james_gosling@shortmail.com",
	                 "ken.thompson@gmail.com", "stephen_hawking@rediffmail.com", "marie_curie@yahoo.com", 
	                 "michael.faraday@hotmail.com", "charles.babbage@hotmail.com" };
	
	       finddomains(emailIds);
}
		private static void finddomains(String[] emailIds2) {
			Map <String,String> map=new TreeMap<String, String>();
			Set<String> ans = new TreeSet<>();
			List<String> mail=new ArrayList<String>();
			List<String> domain=new ArrayList<String>(ans);
			 
	        // Loop to find the unique domains
	        for (int i = 0; i < emailIds2.length; i++) {
	 
	            // Find the index of '@' symbol in string
	            int findindex = emailIds2[i].indexOf('@');
	 
	            // Push the substring starting from
	            // findindex + 1 till the end
	            // and then increase its frequency by 1
	            String temp = emailIds2[i].substring(findindex + 1);
	            ans.add(temp);
	           
	        }
	        System.out.println(ans);
	        
	        
	        for (int i = 0; i < domain.size(); i++) {
	        	for(int j=0;j<emailIds2.length;j++)
	        	{
	        		if(emailIds2[j].contains(domain.get(i)))
	        		{
	        			
	        			map.put(domain.get(i),emailIds2[j]);
	        		}
	        	}

	        	 
	        
	        }
	        System.out.println(map);
	       
		}
		
		
/*
		ans -key--> ans[i]
				em-> em[j]
						
						if(emp[j].cons(ans[i])) {
							n.add(emp[j])
							map.put(ans[i],n)
						}
				*/

}
