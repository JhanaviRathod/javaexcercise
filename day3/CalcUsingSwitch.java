package day3;
import java.util.*;
public class CalcUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operator;
		System.out.println("Enter 2 integer");
		num1 =  sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Enter +, -, *, /, %");
		operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+': System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); 
		break;
		case '-' : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		break;
		case '*' : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		break;
		case '/' : System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		break;
		case '%' : System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		break;
		default: System.out.println("Enter valid operator");
		
		}
		
		sc.close();
	}

}
