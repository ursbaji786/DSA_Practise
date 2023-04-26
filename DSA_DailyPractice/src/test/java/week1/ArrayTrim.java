package week1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrayTrim {
	
	@Test
	public void TC1() {
		int[] arr = {2,3,4,5,6,7,8};
		int num = 3;
		trimLength(arr, num);
		
	}
	
	public void trimLength(int[] arr, int num) {
		
		int[] output = new int[num];
		
		for(int i = 0 ; i < num; i++) {
			output[i] = arr[i];
		}
		
		//print
		System.out.println(Arrays.toString(output));
	}

	
}
