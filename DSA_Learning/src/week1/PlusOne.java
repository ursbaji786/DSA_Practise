package week1;

import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOneMethod (int[] digits) {
		 
		 
		 //for 1,2,3
		    for(int i=digits.length-1; i>=0; i--) {
		    	
		        if(digits[i] != 9) {
		        	 digits[i]++; // if we assign tnis then its allocatting another space and not assigning new digit value
		            return digits;
		        }
		        
		        //for 9's ex: 499
		        digits[i] = 0;
		    }
		    //for single 9
		    digits = new int [digits.length+1];
		    digits[0]=1;
		    return digits;
		    }

	public static void main(String[] args) {
		
		int[] digits= {1,2,3};
		
		//plusOneMethod(digits);
		
		System.out.println(Arrays.toString(plusOneMethod(digits)));
		

	}

}
