import java.util.Scanner;
class Pallindrome{
	
	static int reverse(int num, int rev){
		if(num == 0){
			return rev;
		}
		else{
			rev = rev * 10 + num % 10;
			return reverse(num/10, rev);
		}
	}
	
	static boolean pallin(int num){
		if(num < 0)
			return false;
		return num == reverse(num, 0);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		
		if(pallin(num)){
			System.out.println("Pallindrome Number");
		}
		else
			System.out.println("Not Pallindrome");
	}
}