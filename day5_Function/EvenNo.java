package day5_Function;
import java.util.*;
public class EvenNo {
	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer to check even");
		int k = sc.nextInt();
		
		if (isEven(k)) {
			System.out.println("Its even number");
		}
		else {
			System.out.println("Not a even number");
		}
		
		
		sc.close();
	}

}
