package operators;
import java.io.*;
public class RootsOfQuadrticEqn {

	public static void main(String[] args)throws IOException {
		
		float a, b, c;
		float rt1, rt2;
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the 1st integer");
		a = Float.parseFloat(br.readLine());
		System.out.println("Enter the 2nd integer");
		b = Float.parseFloat(br.readLine());
		System.out.println("Enter the 3rd integer");
		c = Float.parseFloat(br.readLine());
		
		// calculate the determinant (b2 - 4ac)
		float determinant = b * b - 4 * a * c;
		
		//check if determinant is grater than 0
		if (determinant>0) {
			rt1 = (float) ((-b + Math.sqrt(determinant)) / (2 * a));
			rt2 = (float) ((-b - Math.sqrt(determinant)) / (2 * a));
			System.out.println("Root 1 = " + rt1 + "Root of 2 is "+ rt2);
		}
		// check if determinant is equal to 0
		else if (determinant == 0) {
			// two real and equal roots
		      // determinant is equal to 0
		      // so -b + 0 == -b
			rt1 = rt2 = -b / (2 * a);
			System.out.println("Root 1 = " + rt1 + "Root of 2 is "+ rt2);
		}
		// if determinant is less than zero
		else {
			float real = -b / (2 * a);
			float imag = (float) Math.sqrt(determinant)/ (2 * a);
			System.out.println("root 1 = " + (real + imag)+ "Root 2 =" + (real - imag));
		}
		
		
		
	}

}
