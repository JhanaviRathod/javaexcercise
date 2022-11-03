package day5_Function;
import java.util.*;
public class DecimalToBinary {
	public static void decToBin(int n) {
		int pow = 0;
		int MyNum = n;
		int bin = 0;
		
		while(n > 0 ) {
			int remainder = n % 2;
			
			bin = bin + remainder * (int) Math.pow(10, pow);
			pow++;
			
			n /= 2;
			
		}
		System.out.println("Binary of "+ MyNum + " is " + bin);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal to convert binary ");
		int k = sc.nextInt();
		decToBin(k);
		sc.close();
	}

}
