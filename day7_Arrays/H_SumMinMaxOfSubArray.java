package day7_Arrays;

public class H_SumMinMaxOfSubArray {

	public static void subArray(int arr[]) {
		int total_subarray = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i ; j < arr.length; j++) {
				int end = j;
				sum = 0;
				for(int k = start; k <= end; k++) {
					
					System.out.print(arr[k] + " ");
					
					sum = sum + arr[k];
					
					
				}
				System.out.print("Sum : " + sum);
				//max of sum
				if(max < sum) {
					max = sum;
				}
				//min of sum
				if (min > sum) {
					min = sum;
				}
				total_subarray++;
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Total number of sub array are " + total_subarray);
		System.out.println("max sum = "+ max+ " min sum = " + min);
	}
	
	public static void main(String[] args) {
		int numbers[] = {2 , 4 , 6, 8, 10, 12, 14};
		subArray(numbers);


	}

}
