package day2;
import java.util.*;
public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num;
		boolean flag = false;
		System.out.println("Enter the number");
		num = sc.nextInt();
		for (int i = 2; i <= num /2 ; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println("Its prime number");
		}
		else {
			System.out.println("Its not prime number");
		}
		sc.close();
	}

}
