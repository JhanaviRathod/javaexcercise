package day3;

public class ArmstronNo3Digit {

	public static void main(String[] args) {
		int num = 371, originalNo, remainder, result = 0;
		
		originalNo = num;
		
		while(originalNo != 0) {
			remainder = originalNo % 10;
			result = (int) (result + Math.pow(remainder, 3));
			originalNo /= 10;
		}
		if(result == num) {
			System.out.println("Its armstrong number");
		}
		else {
			System.out.println("Its not armstrong number");
		}
	}

}
