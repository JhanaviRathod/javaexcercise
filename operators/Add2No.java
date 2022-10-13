package operators;
import java.io.*;
public class Add2No {

	public static void main(String[] args) throws IOException {
		int a, b, result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the integer");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter 2nd integer");
		b = Integer.parseInt(br.readLine());
		
		result =  a + b;
		System.out.println("Addition of two number " + result);

	}

}
