package day4;
import java.util.*;
public class CharFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int index;
		
		System.out.println("Enter the string");
		input = sc.nextLine();
		System.out.println("Enter the index");
		index = sc.nextInt();
		System.out.println("Character from " + input + " at " + index + "nd the character is " + input.charAt(index));
		
		sc.close();
	}

}
