package operators;
import java.util.*;
public class RemoveSpaceFormStr {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String input;
		System.out.println("Enter a string");
		input = sc.nextLine();
		
		String sentence =  input.replaceAll("\\s", "");
		System.out.println("After removing space string is :- " + sentence);
		
		sc.close();
	}

}
