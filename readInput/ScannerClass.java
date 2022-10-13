package readInput;
import java.util.*;
public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short num;
		System.out.println("Enter the integer");
		num = sc.nextShort();
		System.out.println("The integer is "+ num);
		
		sc.close();

	}

}
