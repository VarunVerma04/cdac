import java.util.*;
import java.lang.*;

class ArmstrongNumber{
	static int len = 0;
	static int isArmstrong(int num, int order){
		
		if (num == 0){
			return 0;
		}
		int digit = num % 10;
		return (int) Math.pow(digit, order) + isArmstrong(num/10, order);
	}
	
	static int order(int num){
		while(num != 0){
			len++;
			num /= 10;
		}
		return len;
	}
	
	
	
	public static void main(String[] args){
		//ArmstrongNumber astn = new ArmstrongNumber();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int len = order(num);
		
		if(num == isArmstrong(num, len)){
			System.out.println(num + " is ArmStrong");
		}
		else 
			System.out.println("Not ArmstrongNumber");
		
		
	}
}
