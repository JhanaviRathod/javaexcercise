package operators;
import java.io.*;
public class FrequencyOfCharInStr {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
		String str;
		char ch;
		int freq = 0;
		
		System.out.println("Enter a string");
		str = br.readLine();
		
		System.out.println("Enter a char to check frequency");
		ch = (char)br.read();
		
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				++freq;
			}
		}
		System.out.println("Frequency is "+ freq);

	}

}
