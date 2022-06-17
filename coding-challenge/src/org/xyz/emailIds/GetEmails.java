package org.xyz.emailIds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GetEmails {
	
public static void main(String[] args) {
	List<String> emails=Arrays.asList("albert.eisntein@gmail.com", "jagadish_chandra_bose@yahoo.com",
			"srinivasa.ramanujan@gmail.com", "bjarne_stroustrup@yahoo.com", "max.planck@gmail.com",
			"nikola.tesla@hotmail.com", "galileo_galilei@hotmail.com", "a.p.j.abdul.kalam@gmail.com",
			"richard.stallman@inbox.com", "john_von_neumann@mail.com", "c_v_raman@yahoo.com",
			"isaac.newton@yandex.com", "s_chandrashekar@hotmail.com", "james_gosling@shortmail.com",
			"ken.thompson@gmail.com", "stephen_hawking@rediffmail.com", "marie_curie@yahoo.com",
			"michael.faraday@hotmail.com", "charles.babbage@hotmail.com");
	
	Map<String,List<String>> parsedEmails=new HashMap<String, List<String>>();
	//System.out.println(parsedEmails);
	for(String email:emails)
	{
		int start=email.indexOf('@');
		int end=email.indexOf(".com");
		String domain=email.substring(start+1,end);
		if(parsedEmails.containsKey(domain))
		{
			List<String> currentemails=parsedEmails.get(domain);//to store all the mails
			//System.out.println(currentemails);
			currentemails.add(email);
		}
		else
		{
			List<String> currentemails=new ArrayList<String>();
			currentemails.add(email);
			parsedEmails.put(domain,currentemails);
		}
	}
	for(String domain:parsedEmails.keySet()) {
		System.out.println(domain);
		System.out.println("----------------------");
		for(String emailss:parsedEmails.get(domain))
		{
			System.out.println(emailss);
		}
		System.out.println();
	}
}

}