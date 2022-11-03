/* 
 A pyramid number pattern of row size r = 5 would look like:
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
 */

package day6_Patterns;

public class PyramidNumbersTriangle {
	public static void PyramidTriangle(int k) {
		int row;
		row = k;
		
		for(int i = 3;i<= row; i++) {
			
			for(int spaces = 1; spaces <= (row - i); spaces++ ) {
				System.out.print("  ");
			}
			
			for(int j = 1; j<= (2 * i - row) ; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int k = 5;
		PyramidTriangle(k);

	}

}
