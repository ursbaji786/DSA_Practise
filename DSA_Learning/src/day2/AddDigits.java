package day2;



public class AddDigits {

	public static void main(String[] args) {
		
		int num = 1;
		int output;
		
		if (num%9 ==0) {
			output = 9;
		}else
			output = num %9;
		System.out.println("sum of digits is: " + output);
		
		// method 2
		
		if(num < 9) {
			output = num;
		}
		if (num > 9) // num is > 9 then do minus
		{
			output = num - 9;
			if (output > 9) {
				output = output - 9;
			}
		}
		System.out.println("sum of digits from 2nd method is: " + output);
			

	}

}
