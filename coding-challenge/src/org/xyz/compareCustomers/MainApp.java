package org.xyz.compareCustomers;

public class MainApp {
	public static void main(String[] args) {
        Address a=new Address("BTM","Banglore");
       Address a1=new Address("BTM","Bang");
       Address a2=new Address("BTM","Banglore");
       
       Address add[]= {a,a1,a2};
       
       Customer c=new Customer(1,"akhila","akhila@189",a);
       Customer c1=new Customer(1,"akhila","akhila@189",a1);
       Customer c2=new Customer(1,"akhila","akhila@189",a2);
       Customer cust[]= {c1,c2,c};
    
       System.out.println(a);
       System.out.println(a1);
       System.out.println(c);
       System.out.println(c1);


        System.out.println(c.equals(c2));
        System.out.println(c1.equals(c2));

        
        
	}

}
