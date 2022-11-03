package day8_Arrays;
import java.util.*;
public class M_ArrayTwiceNo {
	
	public static boolean twiceNo(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {

					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements in array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i <n ; i++) {
			System.out.println("Enter: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(twiceNo(arr));
		
		sc.close();
	}

}
