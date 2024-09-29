
import java.util.Scanner;

class Factorial
{
	static int fact(int k)
	{
		if (k == 1)
		{
			return 1;
		}
		else
		{
			return k*fact(k-1);
		}
	}
	
	
	public static void main(String[] ags)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int n = scan.nextInt();
		
		System.out.println(fact(n));
	}
}

