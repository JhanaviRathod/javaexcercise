package readInput;
import java.io.*;
public class BufferClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		short num3;
		System.out.println("Enter a integer");
		num3 = Short.parseShort(br.readLine());
		System.out.println("The String is "+ num3);

	}

}
