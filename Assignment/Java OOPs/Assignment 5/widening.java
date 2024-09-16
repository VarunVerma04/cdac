package org.type.exmple;
import java.util.Scanner;

public class widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println(num);
		double num2 = num;
		System.out.println("Widening Conversion: " +num2);
		
	}

}
