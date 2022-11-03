package day4;
import java.util.*;
public class ReverseStrinf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer input = new StringBuffer("");
		
		System.out.println("Enter a string to reverse");
		input =  input.append(sc.nextLine());
		
		System.out.println("The reverse stirng is "+ input.reverse());
		
		sc.close();

	}

}
