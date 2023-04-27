package day1;

import java.util.Arrays;

public class Trim {

	public static void main(String[] args) {

		int[] arr = {2,3,4,5,6,7,8};
		int num = 3;

		int[] output = new int[num];
		
		for(int i = 0 ; i < num; i++) {
			output[i] = arr[i];
		}
		
		//print
		System.out.println(Arrays.toString(output));
	}

}
