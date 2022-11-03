package day5_Function;
import java.util.*;
public class BinaryToDeciaml {
	
	public static void binToDec(int binNum) {
		int pow = 0, decNum = 0;
		int MyNum = binNum;
		while(binNum > 0 ) {
			int last_digit = binNum % 10;
			decNum = decNum + ( last_digit * (int)Math.pow(2, pow));
			pow++;
			binNum /= 10;
		}
		System.out.println("Decimal of "+ MyNum + " is " + decNum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int k = sc.nextInt();
		binToDec(k);
		
		sc.close();
	}

}
