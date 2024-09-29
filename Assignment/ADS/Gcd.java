import java.util.Scanner;
class Gcd{
	
	static int gcd(int n, int m){
		if (m == 0){
			return n;
		}
		else{
			return gcd(m, n%m);
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int n = scan.nextInt();
		System.out.println("Enter second number ");
		int m = scan.nextInt();
		
		int gcd = gcd(n, m);
		System.out.println("GCD is of " + n +" and " + m +" is " + gcd);
	}
}