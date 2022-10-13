package day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 10, fstTerm = 0, lstTerm = 1, nxtTerm;
		
		for (int i = 1; i <= num; i++) {
			System.out.print(fstTerm + ", ");
			
			// computing next term
			nxtTerm = fstTerm + lstTerm;
			fstTerm = lstTerm;
			lstTerm = nxtTerm;  
		}
		
	}

}
