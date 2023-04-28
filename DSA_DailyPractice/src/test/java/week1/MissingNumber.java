package week1;

public class MissingNumber {
	
	/*Psedudo code
	 * 
	 *   n*(n+1)/2 > arthematic progress (sum of n natural numbers
	 *   
	 *   sum of elements in array
	 *   
	 *   then missing number is n*(n+1)/2 - sum of elements in array
	 * 
	 */

	public static void main(String[] args) {

		int[] a = {9,6,4,2,3,5,7,0,1};
		
		int n = a.length;
		
		int sum =0;
		
		int missingNumber = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];		// sum of all values from array	
		}
		
		missingNumber = (n*(n+1))/2 -sum ;
		
		System.out.println(missingNumber);
		

	}

}
