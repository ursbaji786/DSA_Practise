package week1;

import java.util.Arrays;

public class RemoveValueFromArray {
	
	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5};
		int value = 3;
		int[] output = new int[input.length-1];
		
		int j=0;
		for (int i = 0; i < input.length; i++) {
			
			if(input[i]!=value) {
				output[j++]=input[i];
			}
			
		}
		System.out.print(Arrays.toString(output));
			
}
}