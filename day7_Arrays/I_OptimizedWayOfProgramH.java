package day7_Arrays;

public class I_OptimizedWayOfProgramH {

	public static void subArray(int arr[]) {
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int preffix[] = new int[arr.length];
		
		//calculate prefix array
		preffix[0] = arr[0];
		for(int i = 1; i < preffix.length; i++) {
			preffix[i] = preffix[i-1] + arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i ; j < arr.length; j++) {
				int end = j;
				
				sum = start == 0 ? preffix[end] :preffix[end] - preffix[start - 1];
				
				if(max < sum) {
					max = sum;
				}
				if(min > sum) {
					min = sum;
				}

				
			}
			
		}
		
		System.out.println("max sum " + max);
		System.out.println("min sum " + min);
	}
	
	public static void main(String[] args) {
		int numbers[] = {2 , 4 , 6, 8, 10, 12, 14};
		subArray(numbers);


}
}
