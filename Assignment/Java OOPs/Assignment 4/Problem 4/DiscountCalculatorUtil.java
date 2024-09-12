package org.retail.demo;

import java.util.Scanner;

public class DiscountCalculatorUtil {
	DiscountCalculator dc = new DiscountCalculator();
	public void acceptRecord(Scanner scan) {
		System.out.println("Enter the original Price: ");
		dc.setOriginalPrice(scan.nextDouble());
		System.out.println("Enter Discount Percentage: ");
		dc.setDiscountRate(scan.nextDouble());
		
		dc.calculatediscount();
		
	}
	
	public void printRecord() {
		System.out.println("The discount Amount is: " + dc.getDiscountAmount());
		System.out.println("The final price is: " + dc.getFinalPrice());
	}
}
