package day3;

public class RightPascalTraingle {

	public static void main(String[] args) {
		
		/*Pseudo code
		 * 
		 *  first to print upper portion
		 *     > outer loop to iterate over the number of rows
		 *     > first inner loop to print star and a space where j <= i 
		 *     > after each iteration of outer loop comes to new line
		 * 
		 * second to print lower portion
		 *     > outer loop to iterate over the number of rows starting from n-1
		 *     > first inner loop to print star with space where j < i-1
		 *     > after each iteration of outer loop comes to new line
		 * 
		 */

		int n = 5; // no of rows
		
		//travel out loop 1
		
		for (int i =0; i <n; i++) {
			// print star and then space
			
			for (int j=0; j<=i; j++) {
				System.out.print("*"+" ");		
			}
			System.out.println(); // new line after each time
		}
		
		// part2 loop
		
		for (int i = n-1; i >=0 ; i--) {
			// print star and then space
			
			for (int j=0; j<=i-1; j++) {
				System.out.print("*"+" ");		
			}
			System.out.println(); // new line after each time
		}
		
		

	}

}
