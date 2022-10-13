package operators;
import java.io.*;
public class VowelOrConsonant {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
		char ch;
		System.out.println("Enter a alphabet");
		ch = (char)br.read();
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
			System.out.println("It is vowel");
			
		}
		else {
			System.out.println("Its consonant");
		}
	}

}
