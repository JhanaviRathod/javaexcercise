package day7_Arrays;

public class G_SubArray {
	
	public static void subArray(int arr[]) {
		int total_subarray = 0;
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i ; j < arr.length; j++) {
				int end = j;
				for(int k = start; k <= end; k++) {
					System.out.print(arr[k] + " ");
				}
				total_subarray++;
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Total number of sub array are " + total_subarray);
	}
	
	public static void main(String[] args) {
		int numbers[] = {2 , 4 , 6, 8, 10, 12, 14};
		subArray(numbers);

	}

}
