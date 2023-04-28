package day2;



public class AddDigits {

	public static void main(String[] args) {
		
		/*Pseudo code
		 * 
		 * https://leetcode.com/problems/add-digits/
		 * 
		 *  10 means 1, 11 means 2 , 12 > 3, 13 > 4 so
		 *  
		 *  Initialise output variable
		 *  if number is less than 9 then print number itself
		 *  find the input number modulus 9 ( num % 9 )
		 *  if num % 9  is equals to 0 then output is 9
		 *  else (num%9 is not 0) then output will be number modulus of 9
		 *  
		 * 
		 */
		
		int num = 1;
		int output;
		
		if (num%9 ==0) {
			output = 9;
		}else
			output = num %9;
		System.out.println("sum of digits is: " + output);
		
		// if number is less than 9 then print number itself
		
		if(num < 9) {
			output = num;
		}
		
		System.out.println("sum of digits from 2nd method is: " + output);
			

	}

}
