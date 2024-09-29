import java.util.*;
class ReverseArray{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = scan.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++){
		System.out.println("Enter the elements of an array");
		arr[i] = scan.nextInt();
	}
	
	int[] result = new int[size];
	for(int i = arr.length; i > 0; i--){
		System.out.print(i + " ");
	}
	//for(int i : result){
	//	System.out.print(i + " ");
	//}
	}
	
	
}