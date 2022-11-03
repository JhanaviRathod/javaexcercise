package day5_Function;
//calculate nCr = n! / r!(n-r)!
import java.util.*;
public class BinomialCoefficient {
	//Extending factorial method program
	//this function is to calculate factorial 
	public static int factorial(int k) {
		int fact = 1;
		
		for(int i = 1; i <= k ; i++) {
			fact *= i;
		}
		return fact;
	}
	//this function will calculate binomial coefficient
	public static float BinoCoe(int n, int r) {
		float BinomialC = 1;
		
		BinomialC = factorial(n) / (factorial(r) * factorial(n-r));
		
		return BinomialC;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and r to find Binomial Coefficient  ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Binomial Coefficent is " + BinoCoe(n1,n2));
		sc.close();


	}

}
