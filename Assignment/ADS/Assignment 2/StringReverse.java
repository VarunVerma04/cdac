import java.util.*;
class StringReverse{
	public static void main(String[] args){
		String result = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		for(int i = str.length()-1; i >= 0; i--){
			result += str.charAt(i);
		}
		System.out.println(result);
	}
}