package day3;
import java.util.*;
public class FactorsOfInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter +ve number to find factors");
		num = sc.nextInt();
		System.out.println("The factors are :- ");
		
		for (int i = 1; i <= num; ++i ) {
			if (num % i == 0) {
				System.out.print(i + " ");
				
			}
		}
		sc.close();
	}

}
