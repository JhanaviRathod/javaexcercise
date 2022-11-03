package day5_Function;
import java.util.*;

public class ProductOf2No {
	
	public static int product(int a, int b) {
		int multiply = a * b;
		return multiply;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number for multiplication");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();							
														//calling function 
		System.out.println("Product of 2 number are " + product(n1, n2) );
		
		sc.close();

	}

}
