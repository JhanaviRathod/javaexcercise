package day5_Function;

public class PrimeNoUsingFunction {
	public static boolean checkPrimeNo(int num){
		boolean flag = true;
		
		for(int i = 2; i <= num/2; ++i) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
		
	}
	
	
	
	
	public static void main(String[] args) {
		int start = 20, end = 50;
		
		while (start < end) {
			if(checkPrimeNo(start)) 
				System.out.print(start + " ");
				++start;
		}
	}

}
