package week1;



public class AddDigits {

	public static void main(String[] args) {
		
		int num = 38;
		int output;
		
		if (num%9 ==0) {
			output = 9;
		}else
			output = num %9;
		System.out.print("sum of digits is: " + output);

	}

}
