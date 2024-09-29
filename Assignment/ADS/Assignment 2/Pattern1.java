import java.util.*;
class Pattern1{
	
	static void printTriangle(int num, int row){
		if (row > num){
			return ;
		}
		else{
			for(int i = 0; i < row; i++){
				System.out.print("*");
			}
			System.out.println();
			printTriangle(num, row+1);
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		printTriangle(num, 1);
	}
}