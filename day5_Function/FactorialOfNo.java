package day5_Function;
import java.util.*;
public class FactorialOfNo {
	public static int factorial(int k) {
		int fact = 1;
		
		for(int i = 1; i <= k ; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find a factorial ");
		int n = sc.nextInt();
		System.out.println("Factorial of "+ n + " is " + factorial(n));
		sc.close();

	}

}
