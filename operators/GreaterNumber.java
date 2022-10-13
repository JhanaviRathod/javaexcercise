package operators;
import java.io.*;
public class GreaterNumber {

	public static void main(String[] args)throws IOException {
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
		int a, b, c, big;
		System.out.println("Enter the 1st integer");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter the 2nd integer");
		b = Integer.parseInt(br.readLine());
		System.out.println("Enter the 3rd integer");
		c = Integer.parseInt(br.readLine());
		
		big = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
		System.out.println("Max number "+ big);
		

	}

}
