package day7_Arrays;
//without copying ar array
//optimized way
public class E_ReverseArray {
	public static void reverseArray(int arr[]) {
		int first = 0, last = arr.length - 1;
		while(first<last) {
			//swap the numbers
			arr[first] = arr[first] + arr[last];
			arr[last] = arr[first] - arr[last];
			arr[first] = arr[first] - arr[last];
			
			//after swap
			first++;
			last--;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int numbers[] = {2 , 4 , 6, 8, 10, 12, 14};
		reverseArray(numbers);
		

	}

}
