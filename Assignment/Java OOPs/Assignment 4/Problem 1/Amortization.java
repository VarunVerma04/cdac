package org.loan;
import java.util.Scanner;

import oops.EmployeeUtil;

class LoanAmmortizationCalcuator{
	 double principal;
	 double annualInterestRate;
	 double loanTerm;
	 double numberOfMonths;	
     double monthlyPayment;
     double monthlyInterestRate;
	 double totalAmount;
	
	public LoanAmmortizationCalcuator() {
		this.principal = 0;
		this.annualInterestRate = 0;
		this.loanTerm =  0;
	}
	
	public LoanAmmortizationCalcuator(double principal, double annualInterestRate, double loanTerm) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTerm;
	}
	
	public double getPrincipal() {
		return this.principal;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getLoanTerm() {
		return this.loanTerm;
	}
	
	public void setLoanTerm(double loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public double getNumberOfMonths() {
		return this.numberOfMonths;
	}
	
	public double getMonthlyPayment() {
		return this.monthlyPayment;
	}
	
	public double getMonthlyInterestRate() {
		return this.monthlyInterestRate;
	}
	
	public double getToatalAmount() {
		return this.totalAmount;
	}
	
	public void calculate() {

		this.monthlyInterestRate = this.annualInterestRate / 12 / 100; 
		double numberOfMonths = loanTerm * 12;
		monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
		totalAmount = monthlyPayment * (loanTerm * 12);
	}
}

class LoanUtil{
	
	private LoanAmmortizationCalcuator ln = new LoanAmmortizationCalcuator();
	
	public void acceptRecord(Scanner scan) {
		
		System.out.println("Enter the Principal ");
		ln.setPrincipal(scan.nextDouble());
		
		System.out.println("Enter AnnualInterestRate  :");
		ln.setAnnualInterestRate(scan.nextDouble());
		
		System.out.println("ENter Loan Term  : ");
		ln.setLoanTerm(scan.nextDouble());
		//scan.close();
		ln.calculate();
	}
	
		
	
	public void printRecord() {

		System.out.println("MonthlyPayment 	:" + ln.getMonthlyPayment());
		System.out.println("Total Amount 	:" + ln.getToatalAmount());	

	}
	
	public static int menuList() {
		Scanner scan = new Scanner(System.in);
		System.out.println("0. EXIT");
		System.out.println("1. ACCEPT RECORD");
		System.out.println("2. PRINT RECORD");
		System.out.println("Enter Choice");
		int choice = scan.nextInt();
		return choice;

}
}


	//@Override
	//public String toString() {
		//return "LoanUtil [ln=" + ln + "]";
	//}}
public class Amortization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LoanUtil ut = new LoanUtil();
		//ut.acceptRecord(scan);
		
		//ut.printRecord();
		
		int choice;		
		//EmployeeUtil util = new EmployeeUtil();
		
		while((choice = LoanUtil.menuList()) != 0) {
			switch(choice) {
			case 1:
				ut.acceptRecord(scan);
				break;
			case 2:
				ut.printRecord();
				break;
			}
			
		}
	}
}
