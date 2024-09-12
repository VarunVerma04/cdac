package org.interest.demo;

public class CiCalculator {
	private double investment;
	private double interestRate;
	private double interestCompound;
	private double years;
	private double futureValue;
	private double totalInterest;
	
	public CiCalculator() {
		this.investment = 0.0;
		this.interestRate = 0.0;
		this.interestCompound = 0.0;
	}
	
	public CiCalculator(double investment, double interestRate, double interestCompound) {
		this.investment = investment;
		this.interestRate = interestRate;
		this.interestCompound = interestCompound;
	}
	
	public double getInvestment(double investment) {
		return this.investment;
	}
	public void setInvestment(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getinterstRate(double interestRate) {
		return this.interestRate;
	}
	public void setinterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getinterestCompound(double interestCompound) {
		return this.interestCompound;
	}
	public void setinterestCompound(double interestCompound) {
		this.interestCompound = interestCompound;
	}
	
	public double getyears() {
		return this.years;
	}
	public void setyears(double years) {
		this.years = years;
	}
	
	
	public double gettotalInterest() {
		return this.totalInterest;
	}

	public double getfutureValue() {
		return this.futureValue;
	}

	@Override
	public String toString() {
		return "CiCalculator [investment=" + investment + ", interestRate=" + interestRate + ", interestCompound="
				+ interestCompound + ", futureValue=" + futureValue + ", totalInterest=" + totalInterest + "]";
	}
	
	public void calculation() {
		System.out.println("Error ka karan");
		this.futureValue = this.investment * Math.pow((1 + (this.interestRate/100)/this.interestCompound), (this.interestCompound *years));
		//futureValue = investment*Math.pow((1+(rate/100)/compoundingTime),
				//(compoundingTime*duration));
		//totalInterest = futureValue - principal;
		this.totalInterest = this.futureValue - this.investment;
		System.out.println(futureValue);
		System.out.println(totalInterest);
	}

}
