package week1;


import java.util.Arrays;

public class FirstAndLast {

	public static void main(String[] args) {

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
