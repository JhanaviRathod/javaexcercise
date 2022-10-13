package day2;
import java.util.*;
public class DisplayPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low, high, i, j;
		
		System.out.println("Enter interval");
		low = sc.nextInt();
		high = sc.nextInt();
		System.out.println("The prime numbers are : - ");
		 for(i = low; i <= high; i++) {
			
			for (j = 2; j <= i ; j++) {
				if (i % j ==0)
					break;
			}
			if (i == j) {
				System.out.print(j + " ");
			}
		}
		
		
		
		
		sc.close();

	}

}
