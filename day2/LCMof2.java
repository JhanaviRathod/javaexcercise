package day2;

public class LCMof2 {

	public static void main(String[] args) {
		int n1 = 8, n2 = 12, lcm, gcd = 1;
		
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if ( n1 % i == 0 & n2 % i == 0 ) {
				gcd = i;
			}
		}
		
		lcm = n1 * n2 / gcd;
		System.out.println("The gcd of 2 no is "+ gcd + " and lcm of 2 number is " + lcm);
	}

}
