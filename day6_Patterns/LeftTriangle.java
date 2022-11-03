package day6_Patterns;

public class LeftTriangle {
	public static void StarLeftTriangle(int k){
		int i, j;
		for (i = 1; i <= k ; i++) {
			
			//printing spaces
			for(j = 2 * (k - i); j >= 0; j--) {
				System.out.print(" ");
			}
			
			// print star
			for (j =1; j <= i ; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int k = 5;
		StarLeftTriangle(k);

	}

}
