package day2;
import java.util.*;
public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.println("Enter a charcter");
		ch = sc.next().charAt(0);
		
		if ( (ch >= 'A' && ch <= 'Z' ) || (ch >= 'a' && ch <='z' )) { //Character.isAlphabetic(ch)
			System.out.println("Its alphabet");
		}
		else {
			System.out.println("Its not alphabet");
		}
		
		sc.close();
	}

}
