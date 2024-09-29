import java.util.*;

class RemoveSpace{
	public static void main(String[] args){
	String noSpace = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Line");
	String str = scan.nextLine();
	for(int i = 0; i < str.length(); i++){
		char ch = str.charAt(i);
		//Character.isWhitespace is used to remove white spaces from line in java
		if(!Character.isWhitespace(ch)){
			noSpace += ch;
		}
	}
	System.out.println("String with no space is \n" + noSpace);
	}
}