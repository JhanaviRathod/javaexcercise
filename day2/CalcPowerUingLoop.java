package day2;

public class CalcPowerUingLoop {

	public static void main(String[] args) {
		int base = 5, expo = 5;
		long result = 1;
		
		for(; expo != 0; expo--) {
			result *= base;
		}
		
		System.out.println("Result is "+ result);
	}

}
