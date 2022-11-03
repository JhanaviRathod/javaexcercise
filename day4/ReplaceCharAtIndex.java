package day4;
import java.util.*;
public class ReplaceCharAtIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int index;
		char ch1;
		System.out.println("Enter a string");
		input =  sc.nextLine();
		System.out.println("Enter the index to replace");
		index = sc.nextInt();
		System.out.println("Enter a char to replace");
		ch1 = sc.next().charAt(0);
		
		
		
		String newString = input.substring(0, index) + ch1 + input.substring(index + 1);
		
		System.out.println("Replaced string is " + newString);
		
		sc.close();
	}

}
