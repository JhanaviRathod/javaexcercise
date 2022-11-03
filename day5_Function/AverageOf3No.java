package day5_Function;
import java.util.*;
public class AverageOf3No {
	public static int average(int n1, int n2, int n3) {
		int avg, sum;
		sum = n1 + n2+ n3;
		avg = sum / 3;
		return avg;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
					  // calling function
		int average = average(a, b, c);
		System.out.println("Average of 3 numbers are  " + average);
		
		input.close();
	}

}
