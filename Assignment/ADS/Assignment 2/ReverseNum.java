import java.util.*;
class ReverseNum{
	
	static int reverse(int num, int rev){
		if(num == 0){
			return rev;
		}
		else
			rev = rev*10+num%10;
		return reverse(num/10, rev);
	}
	
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println(reverse(num, 0));
		
	}
}