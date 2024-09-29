import java.util.Scanner;
class SquareRoot{
	
	static int sqrt(int num, int m){
		if (m == num){
			return 0;
		}
		if(m*m == num){
			return m;
		}
		else
			return sqrt(num, m+1);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		System.out.println(sqrt(num, 1));
	}
}