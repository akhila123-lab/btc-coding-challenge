package org.xyz.Phone;

import java.util.ArrayList;
import java.util.List;

public class Mobile {
	 private String brandName;
	    private String modelName;
	    private double cost;
	    private String screenSize;
	    private String batteryLife;
	    private String storageSpace;
	    private int cameraPixels;
	    Mobile()
	    {
//	    	 Mobile mobile1=new Mobile("OPPO", "A1k", 10000, "10", "19", "4GB", 100);
//	 		Mobile mobile2=new Mobile("OPPO", "A1k", 10000, "10", "19", "4GB", 100);
//	 		Mobile mobile3=new Mobile("OPPO", "A1k", 10000, "10", "19", "4GB", 100);
//	 		Mobile mobile4=new Mobile("OPPO", "A1k", 10000, "10", "19", "4GB", 100);
//	 		List<Mobile> mobile=new ArrayList<Mobile>();
//	 		mobile.add(mobile1);
//	 		mobile.add(mobile2);
//	 		mobile.add(mobile3);
//	 		mobile.add(mobile4);
	    }
	   
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public String getScreenSize() {
			return screenSize;
		}
		public void setScreenSize(String screenSize) {
			this.screenSize = screenSize;
		}
		public String getBatteryLife() {
			return batteryLife;
		}
		public void setBatteryLife(String batteryLife) {
			this.batteryLife = batteryLife;
		}
		public String getStorageSpace() {
			return storageSpace;
		}
		public void setStorageSpace(String storageSpace) {
			this.storageSpace = storageSpace;
		}
		public int getCameraPixels() {
			return cameraPixels;
		}
		public void setCameraPixels(int cameraPixels) {
			this.cameraPixels = cameraPixels;
		}
		public Mobile(String brandName, String modelName, double cost, String screenSize, String batteryLife,
				String storageSpace, int cameraPixels) {
			super();
			this.brandName = brandName;
			this.modelName = modelName;
			this.cost = cost;
			this.screenSize = screenSize;
			this.batteryLife = batteryLife;
			this.storageSpace = storageSpace;
			this.cameraPixels = cameraPixels;
		}
		@Override
		public String toString() {
			return "Mobile [brandName=" + brandName + ", modelName=" + modelName + ", cost=" + cost + ", screenSize="
					+ screenSize + ", batteryLife=" + batteryLife + ", storageSpace=" + storageSpace + ", cameraPixels="
					+ cameraPixels + "]";
		}
	    

}
