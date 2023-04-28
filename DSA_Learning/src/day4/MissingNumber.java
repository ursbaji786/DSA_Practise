package day4;

public class MissingNumber {
	
	/*Psedudo code
	 * 
	 * take array length as n
	 * 
	 *  Perform arthematic progress (sum of n natural numbers) i.e. n*(n+1)/2 > 
	 *   
	 *  find the sum of all elements in array
	 *   
	 *   then missing number can be found as n*(n+1)/2 - sum of elements in array
	 *   
	 *   Time complexity = O(n)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {0,1,2,3,5};
		
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
