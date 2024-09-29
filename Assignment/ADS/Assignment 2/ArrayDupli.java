import java.util.*;
class ArrayDupli{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++){
			System.out.println("Enter elements of an array");
			arr[i] = scan.nextInt();
		}
		
		Set<Integer> unique = new HashSet<>();
		for(int i : arr){
			unique.add(i);
		}
		
		//set to array
		Integer[] result = unique.toArray(new Integer[0]);
		
		System.out.println("Array after NO Duplicates");
		for(int i : result){
			System.out.print(i + " ");
		}
	}
}