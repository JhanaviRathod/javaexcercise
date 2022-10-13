package day2;

public class CountDigitsInInteger {

	public static void main(String[] args) {
		int num = 50, count = 0;
		
		while (num != 0 ) {
			num = num /  10;
			++count;
		}
		System.out.println("Number of digits: " + count);
	}

}
