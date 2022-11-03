package day5_Function;
import java.util.*;
public class NoPalindrome {
	public static boolean isPalindrome(int n) {
		int pal_number, reverse = 0;
		
		pal_number = n;
		
		while(pal_number != 0) {
			int remainder = pal_number % 10;
			reverse = reverse * 10 + remainder;
			pal_number /= 10;
		}
		
		if(n == reverse) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer to check palindrome ");
		int k = sc.nextInt();
		if(isPalindrome(k)) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not palindrome number");
		}
		sc.close();

	}

}
