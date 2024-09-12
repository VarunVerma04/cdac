package org.revenue.demo;
import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	Scanner scan = new Scanner(System.in);
	TollBoothRevenueManager tbrm = new TollBoothRevenueManager();
	public void acceptRecord() {
		System.out.println("Enter the toll rate for car: ");
		tbrm.setCar(scan.nextDouble());
		System.out.println("Enter the toll rate for bike");
		tbrm.setBike(scan.nextDouble());
		System.out.println("Enter the toll rate for truck");
		tbrm.setTruck(scan.nextDouble());
		
		
	}
	
	public void settingVehicleNumber() {
		
		System.out.println("Enter the number of bikes");
		tbrm.setBikeNumber(scan.nextInt());
		System.out.println("Enter the number of cars");
		tbrm.setCarNumber(scan.nextInt());
		System.out.println("Enter the nummber of trucks");
		tbrm.setTruckNumber(scan.nextInt());
		
		tbrm.calculate();
	}
	
	public void printRecord() {
		
		System.out.print("The total number of Vehicles is: " + tbrm.getVehicleNumber() + "\n");
		System.out.print("Total Revenue collected is: " + tbrm.getTotalRevenue());
		
	}
	
	public void releaseResource() {
		scan.close();
	}

}
//
//1. Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
//2. Accept the number of vehicles of each type passing through the toll booth.
//3. Calculate the total revenue based on the toll rates and number of vehicles.
//4. Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).