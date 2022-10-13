package day2;
import java.util.*;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short num;
		System.out.println("Enter +ve or -ve integer");
		num = sc.nextShort();
		
		if(num > 0) {
			System.out.println("Its positive number");
			
		}
		else if (num < 0) {
			System.out.println("Its negative number");
			
		}
		else {
			System.out.println("Its zero");
		}
		
		sc.close();
	}

}
