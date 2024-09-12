package org.retail.demo;

public class DiscountCalculator {
	private double originalPrice;
	private double discountRate;
	private double discountAmount;
	private double finalPrice;

	public DiscountCalculator() {
		this.originalPrice = 0.0;
		this.discountRate = 0.0;
		//this.discountAmount = 0.0;
		//this.finalPrice = 0.0;
	}
	
	public DiscountCalculator(double originalPrice, double discountRate, double discountAmount, double finalPrice) {
		this.originalPrice = originalPrice;
		this.discountAmount = discountAmount;
		this.discountRate = discountRate;
		this.finalPrice = finalPrice;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}
	
	public void calculatediscount() {
		this.discountAmount = this.originalPrice * (this.discountRate / 100);
		this.finalPrice = this.originalPrice - this.discountAmount;
	}
	
}
