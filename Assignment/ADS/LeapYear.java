import java.util.Scanner;
class LeapYear{
	
	static boolean isLeap(int year){
		if(year % 400 == 0 || year % 4 == 0){
			return true;
		}
		else
			return false;
	}
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an year");
		int year = scan.nextInt();
		
		if(isLeap(year)){
			System.out.println(year + " is a leap year");
		}
		else
			System.out.println(year + " not a leap Year");
	}
}