package day7_Arrays;

public class J_KadenAlgorithm {
	public static void kadens(int numbers[]) {
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			cs = cs + numbers[i];
			if(cs < 0) {
				cs = 0;
			}
			ms = Math.max(cs, ms);
			
		}
		
		System.out.println("Maximum sum of sub array " + ms);
	}
	public static void main(String[] args) {
		int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		kadens(number);
	}

}
