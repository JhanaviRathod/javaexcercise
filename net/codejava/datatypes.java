package net.codejava;
// print the size, min value , max value of all primitive data types
// primitive data types are :- byte, short, int, long, float, double, char
public class datatypes {

	public static void main(String[] args) {
		
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
