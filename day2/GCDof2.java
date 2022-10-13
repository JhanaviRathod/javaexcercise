package day2;
import java.util.*;
public class GCDof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		System.out.println("Enter the 1st number to find gcd");
		n1 = sc.nextInt();
		System.out.println("Enter the 2nd number to find gcd");
		n2 = sc.nextInt();
		
		//always set to positive
		 n1 = ( n1 > 0) ? n1 : -n1;
		 n2 = ( n2 > 0) ? n2 : -n2;
		
		while (n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			}
			else {
				n2 -= n1;
			}
		}
		System.out.println(n1);
		sc.close();
	}

}
