package day2;

import java.util.Arrays;

public class FirstAndLastOccurance {
	
	public static void main(String[] args) {
		
		/* Pesudo code
		 * 
		 * Initialise first and last index values as -1 and count as 0 (used to find output array length
		 * 
		 * > find the first index where the value present i.e Iterate over the array with for loop from starting,
		 *   check if array value is num and firstIndex is -1 then assign that index value to first index and increase Count
		 *   
		 *   > find the 2nd index where the value present i.e Iterate over the array with for loop from last to first,
		 *   check if array value is num and lastIndex is -1 then assign that index value to last index and increase Count
		 *   
		 * > create new output array with length as input array length - count and initialise j=0 to starts with index
		 * 
		 * > Iterate over the input array and add the values to output array by excluding first and last index values
		 * 
		 * > print the output array
		 * 
		 * Time complexity = O(n)
		 * 
		 * 
		 */
		
		int[] a = {1,2,1,2,3,1,4,5,1};
		int num = 1;
		int count = 0;
	
	int firstIndex =-1 , lastIndex = -1;

	for (int i = 0; i < a.length; i++) {
		if (a[i] == num) {
			if (firstIndex == -1) {
				firstIndex = i;
				count++;
			}
		}
	}
	
	for (int i = a.length-1 ; i >=0; i--) {
		if (a[i] == num) {
			if (lastIndex == -1) {
				lastIndex = i;
				count++;
			}
		}
	}
	
	System.out.println(firstIndex +"," +lastIndex);
	
	int[] output = new int[a.length - count];
	int j = 0; // output array index

	for (int i = 0; i < a.length; i++) {
		if (i != firstIndex && i != lastIndex) {
			output[j++] = a[i];
		}
	}
	
	System.out.println(Arrays.toString(output));
	
	}

}
