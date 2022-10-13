package datatypes;

public class datatypes {

	public static void main(String[] args) {
		//boolean example 
		boolean Iot = true;
		System.out.println("Boolean type :-"+Iot);
		
		
		//byte example
		
		byte range = 127;
		System.out.println("range type:- "+range);
		
		// short example
		short range1;
		range1 = -127;
		System.out.println("Short type:- "+range1);
		
		//long example 
		long range3 = 30000000000L;
		System.out.println("Long type:- "+range3);
		
		//double example 
		double number1 = 3.33f;
		System.out.println("double type :-"+number1);
		
		////char example (Unicode value of A is '\u0041')
		char letter1 = '\u0041';
		System.out.println("Char type (unicode):- "+letter1);
		
		char letter2 = 65; //ASCII value
		System.out.println("char type (ASCII):- "+letter2);
		
		char letter3 = 'a';
		System.out.println("Char type:- "+letter3);
		
		
		// print the size, min value , max value of all primitive data types
		// primitive data types are :- byte, short, int, long, float, double, char
		System.out.println("Data types\t Size \t Min \t\t\t\t Max \t");
		// byte data type
		System.out.println("Byte \t\t" +Byte.SIZE + "\t " + Byte.MIN_VALUE + "\t\t\t\t" + Byte.MAX_VALUE);
		
		// short data type
		System.out.println("Short \t\t" + Short.SIZE + "\t" + Short.MIN_VALUE + "\t\t\t\t" + Short.MAX_VALUE);
		
		//int data type
		System.out.println("Int \t\t" + Integer.SIZE + "\t" + Integer.MIN_VALUE + "\t\t\t" + Integer.MAX_VALUE );
		
		//long data type
		System.out.println("Long \t\t" + Long.SIZE + "\t" + Long.MIN_VALUE + "\t\t" + Long.MAX_VALUE );
		
		//float data type 
		System.out.println("Float \t\t" +Float.SIZE + "\t" + Float.MIN_VALUE + "\t\t\t\t" + Float.MAX_VALUE);
		
		//double data type
		System.out.println("Double \t\t" +Double.SIZE + "\t" + Double.MIN_VALUE + "\t\t\t" + Double.MAX_VALUE);
		
		//char data type
		System.out.println("Character \t " + Character.SIZE  );

	}

}
