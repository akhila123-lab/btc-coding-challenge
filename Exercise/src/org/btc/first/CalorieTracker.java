package org.btc.first;

public class CalorieTracker {
	public static void main(String[] args) {
	       
        int cycling=300;
        int running=200;
        int swimming= 500;
        System.out.println("Calorie burnt by cycling "+  cycling);
        System.out.println("Calorie burnt by running "+ running);
        System.out.println("Calorie burnt by swimming "+ swimming);
        int daily=100;
        System.out.println("Calorie burnt by daily intake "+ daily);
        double d=4*2*(cycling+running+swimming)-30*daily;
        System.out.println("calories burnt is: "+d/1000);
    }
}
