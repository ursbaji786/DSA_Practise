package day2;

public class DiamondPattern {
	
	public void myMethod(int input) {
		
		/*Pseudo code
		 * 
		 *  first to print upper portion
		 *     > outer loop to iterate over the number of rows
		 *     > first inner loop to print spaces where j =1 and j<= input-i
		 *     > second inner loop to print stars where j<=i*2-1
		 *     > after each iteration of outer loop comes to new line
		 * 
		 * second to print lower portion
		 *     > outer loop to iterate over the number of rows from i=input-1 to i>0
		 *     > first inner loop to print spaces where j<= input-i
		 *     > second inner loop to print stars where j<=i*2-1 
		 *     > after each iteration of outer loop comes to new line
		 *     
		 *     Time complexity = O(n^2) ?? as iterating over the inner loops
		 * 
		 */
		
		int i,j;
		// to print upper side
		 for (i=1; i<=input; i++){
			 
			 	//for spaces
		        for (j=1; j<= input-i; j++){
		           System.out.print(" ");
		        }
		        //for stars
		        for (j=1; j<=i*2-1; j++ ){
		           System.out.print("* ");
		        }
		        System.out.println();
		  }
		 
		 // to print lower side
				 for (i=input-1; i>0; i--){
					 
					//for spaces
				        for (j=1; j<= input-i; j++){
				           System.out.print(" ");
				        }
				        //for stars
				        for (j=1; j<=i*2-1; j++ ){
				           System.out.print("* ");
				        }
				        System.out.println();
				  } 		
	}

	public static void main(String[] args) {
		
		int input = 5; // number of rows
		DiamondPattern p = new DiamondPattern();
		p.myMethod(input);
		

	}

}
