package day2;
import java.util.*;
public class SumOfNaturalNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		int sum = 0;
		System.out.println("Enter the natural number to find sum");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("Sum is "+ sum);
		sc.close();
	}
	
}
