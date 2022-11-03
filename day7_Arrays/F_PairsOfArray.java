package day7_Arrays;

public class F_PairsOfArray {
	public static void pairsArray(int arr[]) {
		int count = 0;
		for(int i = 0 ; i < arr.length; i++) {
			
			int current = arr[i];
			for(int j = i + 1; j < arr.length ;j++) {
				int pair = arr[j];
				
				System.out.print(" ( " + current + ", " + pair + " ) ");
				count++;
				
			}
			System.out.println();
		}
		System.out.println("Total no of pairs " + count);
	}
	
	public static void main(String[] args) {
		int numbers[] = {2 , 4 , 6, 8, 10, 12, 14};
		pairsArray(numbers);

	}

}
