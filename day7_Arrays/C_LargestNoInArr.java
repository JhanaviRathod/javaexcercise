package day7_Arrays;

public class C_LargestNoInArr {
	
	public static int largestNo(int arr[]) {
		int largestNo = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(largestNo < arr[i] ) {
				largestNo = arr[i];
			}
		}
		return largestNo;
	}
	
	//smallest no in array
	public static int smallestNo(int arr[]) {
		int smallestNo = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if (smallestNo > arr[i] ) {
				smallestNo = arr[i];
			}
		}
		return smallestNo;
	}
	public static void main(String[] args) {
		int numbers[] = {2 , 4 , 6, 8, 10, 12, 14};
		System.out.println("The largest no is " + largestNo(numbers));
		System.out.println("The smallest no is " + smallestNo(numbers));
	}

}
