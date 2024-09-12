package org.bmi.demo;

import java.util.Scanner;

public class BMITrackerUtil {
	BMITracker bmt = new BMITracker();
	
	public void acceptRecord(Scanner scan) {
		System.out.println("Enter the weight: ");
		bmt.setWeight(scan.nextFloat());
		System.out.println("Enter you height:");
		bmt.setHeight(scan.nextFloat());
		
		bmt.calculate();
	}
	
	public void printRecord() {
		if (bmt.getBmi() < 18.5) {
			System.out.println("UnderWight");
		}
		else if (bmt.getBmi() >= 25 && bmt.getBmi() < 24.9) {
			System.out.println("Normal Weight");
		}
		else if (bmt.getBmi() >= 25 && bmt.getBmi() < 29.9) {
			System.out.println("OverWeight");
		}
		else {
			System.out.println("Obese");
		}
		System.out.println(bmt.toString());
	}

}
