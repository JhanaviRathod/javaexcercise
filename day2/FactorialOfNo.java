package day2;
import java.util.*;
public class FactorialOfNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, fact = 1;
		
		System.out.println("Enter the number to find factorial of number ");
		num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			fact *=i;
		}
		System.out.println("Factorial is "+fact);
		
		sc.close();

	}

}
