package day4;

public class SortStringAlphaWithoutSort {

	public static void main(String[] args) {
		String input = "janhavi";
		
		char arr[] = input.toCharArray();
		
		for(int i = 0; i< arr.length; ++i) {
			for (int j = i+1; j < arr.length; ++j ) {
				if (arr[j] < arr[i]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		System.out.println(arr);
		

	}

}
