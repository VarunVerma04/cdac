package org.bmi.demo;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BMITrackerUtil bmu = new BMITrackerUtil();
		//BMITracker bm = new BMITracker();
		bmu.acceptRecord(scan);
		bmu.printRecord();
		//bm.toString();
		//System.out.println(bm.toString());
	}

}
