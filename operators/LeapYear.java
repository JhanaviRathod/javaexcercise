package operators;
import java.io.*;
public class LeapYear {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
		short year;
		System.out.println("Enter a year");
		year = Short.parseShort(br.readLine());
		
		if (year % 4 == 0 && year % 400 ==0 || year % 100 == 0) {
			System.out.println("Its leap year");
			
		}
		else {
			System.out.println("Its not leap year");
		}
		

	}

}
