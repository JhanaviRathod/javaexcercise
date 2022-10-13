package operators;
import java.io.*;
public class Swap2Numbers {

	public static void main(String[] args) throws IOException {
		
		int a, b, temp;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the 1st integer");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter the 2nd integer");
		b = Integer.parseInt(br.readLine());
		System.out.println("Without swaping " + a + " " + b);
		
		// using 3rd variable
		temp = a; // value of a will get store in temp var
		a = b; //value of b will get store in a
		b = temp; // value of temp (i.e a) will get store in b
		System.out.println("after swaping " + a + " " + b); 
		
		
		/* //without using third variable (concept of maths)
		a = a - b; 
		b = a + b; 
		a = b - a; 
		System.out.println("after swaping " + a + " " + b); */
		
		/* // with xor gate
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after swaping " + a + " " + b);
		*/
		
		
		
		
	}

}
