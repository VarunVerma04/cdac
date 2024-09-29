import java.util.Scanner;

class Prime{
	
	static boolean isPrime(int n, int m){
			if(n <= 1){
				return false;
			}
			if(m > n/2){
				return true;
			}
			if(n % m == 0){
				return false;
			}
			else{
				return isPrime(n,m+1);
			}
			
			
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		if(isPrime(n, 2)){
			System.out.println(n + " is Prime");
		}
		else
			System.out.println(n + " is not Prime");
	}
}