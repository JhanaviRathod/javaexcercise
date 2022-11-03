package day5_Function;

public class ArmstrongNoUsingFunction {
	
	public static boolean checkArmstrong(int num) {
		int originalNo, remainder, result = 0, digits = 0;
		boolean flag = false;
		originalNo = num;
		
		//calculation of number of digits
		while (originalNo != 0) {
			originalNo /= 10;
			++digits;
		}
		originalNo = num;
		while(originalNo != 0) {
			remainder = originalNo % 10;
			result += (int) Math.pow(remainder, digits);
			originalNo /= 10;
		}
		if (result == num) {
			flag = true;
			
		}
		return flag;
	}
	public static void main(String[] args) {
		int start = 300, end = 99999;
		
		for(int number = start + 1; number < end; ++number) {

            if (checkArmstrong(number))
                System.out.print(number + " ");
        }

	}

}
