package day2;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, mul = 1;
		
		System.out.println("Which multiplication table do you want? ");
		i = sc.nextInt();
		
		
		for(int j = 1; j <= 10; j++) {
			mul = i * j;
			System.out.println(i + " x " + j + " = " + mul);
		}
	
		sc.close();
	}

}
