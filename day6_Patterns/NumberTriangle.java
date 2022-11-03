package day6_Patterns;

public class NumberTriangle {
public static void NumberTri(int k) {
	int i, j;
	for (i = 1; i <= k; i++ ) {
		
		//printing spaces
		for(j = (k - i); j >= 0 ; --j) {
			System.out.print(" ");
		}
		
		for(j = 1; j <= i; j++) {
			System.out.print(j + " ");
		}
		
		System.out.println();
	}
}
	public static void main(String[] args) {
		int k = 5;
		NumberTri(k);

	}

}
