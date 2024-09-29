import java.util.*;
class RotateArray{
	static void rotate(int[] arr, int d, int size){
		reverse(arr, 0, size-1);
		reverse(arr, 0, d-1);
		reverse(arr, d, size-1);
	}
	
	static void reverse(int[] arr, int start, int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scan.nextInt();
        int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter elements of array: ");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the number of time you want to rotate array: ");
		int d = scan.nextInt();
		rotate(arr, d, size);
		System.out.println(Arrays.toString(arr));
	}
	
}