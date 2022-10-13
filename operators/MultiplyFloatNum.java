package operators;
import java.io.*;
public class MultiplyFloatNum {

	public static void main(String[] args) throws IOException {
		float num1, num2, result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 1st float number");
		num1 = Float.parseFloat(br.readLine());
		System.out.println("Enter the 2nd float number");
		num2 = Float.parseFloat(br.readLine());
		
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		
		
		

	}

}
