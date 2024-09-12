package org.retail.demo;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculatorUtil dcu = new DiscountCalculatorUtil();
		Scanner scan = new Scanner(System.in);
		dcu.acceptRecord(scan);
		dcu.printRecord();
		
	}

}



//1. Accept the original price of an item and the discount percentage from the user.
//2. Calculate the discount amount and the final price using the following formulas:
//    ◦ Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
//    ◦ Final Price Calculation: finalPrice = originalPrice - discountAmount
//3. Display the discount amount and the final price of the item, in Indian Rupees (₹).