package day3;

public class RemoveAllOcuurances {

	public static void main(String[] args) {
		
		/*Pseudo code
		 * 
		 * > with the given index value find the value present at that index and store as indexValue
		 * > initialise count as 0 (used to find output array length)
		 * > Find the count of indexValues present in the array when index value matches increment count
		 * > create new output array with length as inputArrayLength-count
		 * > initialise output index as 0
		 * > move all values other than indexValues to output array and print output array 
		 * 
		 * 
		 */
		
		
		int[] a = {1,2,3,3,4,5,3,2,3,9};
		int index = 2;
		int indexValue = 0;
		int count =0;
		
		
		
		
		// find Index value
		indexValue = a[index];
		System.out.println("Index value is :" + indexValue);
		
		//find the count of indexValues present in array
		for (int i = 0; i < a.length; i++) {
			if(a[i] == indexValue)
				count = count +1;			
		}
		System.out.println("count of index values :" + count);
		
		// create another output array with length as inputarray - count
		
		int[] output = new int[a.length-count];
		
		// move all values other than indexValues to output array
		
		int j =0; // output index starts
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != indexValue) {
				output[j++] = a[i];
			}
			
		}
		
		// print output array
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+",");			
		}
	}

}
