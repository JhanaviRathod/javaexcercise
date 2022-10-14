package day3;
import java.util.*;
public class FactorsOfNegativeInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter -ve number to find factors");
		num = sc.nextInt();
		System.out.println("The factors are :- ");
		//  starts from -60 ;  check till +60 
		for (int i = num; i <= Math.abs(num); ++i) {
			// it will skip the iteration of 0
			if (i == 0) {
				continue;
			}
			else {
				if (num % i == 0) {
					System.out.print(i + " ");
				}
			}
				
		}
		
		sc.close();

	}

}
