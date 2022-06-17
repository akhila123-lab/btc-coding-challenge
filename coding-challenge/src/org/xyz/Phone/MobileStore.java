package org.xyz.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MobileStore extends Mobile{
	
		Mobile newMobile;
		List<Mobile> mobile=new ArrayList<Mobile>();
		public MobileStore() {
			 Mobile mobile1=new Mobile("OPPO", "A1k", 50, "large", "8hours", "130gb", 20);
		 		Mobile mobile2=new Mobile("SAMSUNG", "J4+", 100, "medium", "19", "4GB", 100);
		 		Mobile mobile3=new Mobile("MI", "A1k", 200, "small", "19", "4GB", 100);
		 		Mobile mobile4=new Mobile("ONEPLUS", "A1k", 40, "medium", "10hours", "4GB", 70);
		 		Mobile mobile5=new Mobile("SAMSUNG", "A1k", 700, "large", "10hours", "4GB", 10);
		 		Mobile mobile6=new Mobile("OPPO", "A1k", 50, "medium", "10hours", "4GB", 10);
		 		
		 		mobile.add(mobile1);
		 		mobile.add(mobile2);
		 		mobile.add(mobile3);
		 		mobile.add(mobile4);
		 		mobile.add(mobile5);
		 		mobile.add(mobile6);

		}

	   public List<String> findPhoneByBrand(String brandName)
	    {
		   List<String> findByName= mobile.stream().filter(name->name.getModelName().equals(brandName)).map(name->name.getBrandName()).collect(Collectors.toList());
	        return findByName;
	    }
	   public List<Mobile> findPhoneCostMoreThan500$()
	    {
		   List<Mobile> findByCost=mobile.stream().filter(cost->cost.getCost()>500).collect(Collectors.toList());
	      return findByCost;
	    }
	   public List<Mobile> findPhonePixelMoreThan12MP()
	    {
		   List<Mobile> findPhoneByPixel12MP=mobile.stream().filter(pixel->pixel.getCameraPixels()>12).collect(Collectors.toList());
		      return findPhoneByPixel12MP;
	    }
	   public static void main(String[] args) {
		MobileStore m=new MobileStore();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter brand name");
		String name=sc.next();
		System.out.println("the phones available on this "+name+" brand is");
		System.out.println(m.findPhoneByBrand(name));
		System.out.println();
		System.out.println("the phones cost above 500$ are");
		System.out.println(m.findPhoneCostMoreThan500$());
		System.out.println();
		System.out.println("the phones pixels more than 12 are");
		System.out.println(m.findPhonePixelMoreThan12MP());
	}

}
