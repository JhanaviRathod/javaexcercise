package day2;

public class DisplayAlphabetUsingLoop {

	public static void main(String[] args) {
		System.out.println("LOWERCASE ALPHABETS");
		for (char ch = 'a'; ch >= 'a' && ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		
		System.out.println("\nUPPERCASE ALPHABET");
		for (char ch = 'A'; ch >= 'A' && ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}

	}

}
