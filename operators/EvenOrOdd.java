package operators;
import java.io.*;
public class EvenOrOdd {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
		int number;
		System.out.println("Enter the integer");
		number = Integer.parseInt(br.readLine());
		
		if (number % 2 == 0) {
			System.out.println("Its even number");
		}
		else {
			System.out.println("Its odd number");
		}
	}

}
