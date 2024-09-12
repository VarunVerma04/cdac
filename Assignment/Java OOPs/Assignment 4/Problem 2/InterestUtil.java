package org.interest.demo;
import java.util.Scanner;

public class InterestUtil {
	private CiCalculator ci = new CiCalculator();
	public void acceptRecord() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Initial Investment");
		ci.setInvestment(scan.nextDouble());
		System.out.println("Enter the interest compoundation");
		ci.setinterestCompound(scan.nextDouble());
		System.out.println("ENter the interest Rate");
		ci.setinterestRate(scan.nextDouble());
		System.out.println("Enter the investment duration");
		ci.setyears(scan.nextDouble());
		
		ci.calculation();
	}
	
	public void printRecord() {
		//ci.calculation();
		System.out.println("The Future Value is: " + ci.getfutureValue());
		System.out.println("The Total Interest is: " + ci.gettotalInterest());
	}
}
