package day4;

public class LexicographicalOrder {

	public static void main(String[] args) {
		String[] input = {"janhavi", "varun", "Daivik", "Kunal", "Devki"};
		System.out.println("The sortef strings are:- (Ignoring cases)");
		for (int i = 0; i < 4; ++i) {
			for (int j = i + 1; j < 5; j++) {
				if (input[i].compareToIgnoreCase(input[j]) > 0) {
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		for (int i = 0; i<5; ++i) {
			System.out.print(input[i] + " ");
		}
	}

}
