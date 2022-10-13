package day2;
import java.util.*;
public class ReverseDigitsInIntger {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
		int num, rev = 0;
		System.out.println("Enter a integer ");
		num = sc.nextInt();
		for(; num != 0; num /= 10) {
			int digit = num % 10;
			rev = rev * 10 + digit;
		}
		System.out.println("Reverse integer is "+ rev);
		
		sc.close();
	}

}
