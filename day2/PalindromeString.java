package day2;

public class PalindromeString {

	public static void main(String[] args) {
		String st = "Radar", rev = "";
		
		int strLength = st.length();
		
		for(int i = (strLength - 1); i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		
		if (st.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("Its palindrome");
		}
		else {
			System.out.println("Its not palindrome");
		}

	}

}
