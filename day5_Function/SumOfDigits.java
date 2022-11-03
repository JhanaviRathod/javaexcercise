package day5_Function;
import java.util.*;
// sum of digits e.g. 521 = 5 + 2 +1 = 8

public class SumOfDigits {
	
	public static int sum(int n1) {
		int sum = 0;
		
		while(n1 != 0) {
			int remainder = n1 % 10;
			sum += remainder;
			n1 /= 10;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a integer for sum");
		int k = sc.nextInt();
		int sum = sum(k);
		System.out.println("Sum is " + sum);
		
		sc.close();
	}

}
