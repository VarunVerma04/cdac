import java.util.Scanner;

class Fibonacci
{
	static int fibb(int n)
	{
		if(n <= 1){
			return n;
		}
		else
			return fibb(n-1) + fibb(n-2);
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		System.out.println("The Sequence is: ");
		for(int i = 0; i < n; i++){
			System.out.print(fibb(i) + " ");
		}
	}
	
}
	