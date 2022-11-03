package day7_Arrays;
import java.util.*;
public class A_CreateArray {
	
	//to print array function
	public static void printArray(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	//operations on array
	//percentage of marks
	
	public static void calcPer(int arr[]) {
		int total = 0, percentage;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		percentage = total / arr.length;
		
		System.out.println("\nPercentage of marks is "+ percentage);
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks array size");
		int k = sc.nextInt();
		
		//aray of size k 
		int marks[] = new int[k];
		//this loop will itereate k times and store the value in array marks
		for(int i = 0; i < marks.length; i++) {
			System.out.println("Enter the marks : ");
			marks[i] = sc.nextInt();
		}
		
		System.out.println("Entered marks are " );
		printArray(marks);
		calcPer(marks);
		
		
		sc.close();
	}

}
