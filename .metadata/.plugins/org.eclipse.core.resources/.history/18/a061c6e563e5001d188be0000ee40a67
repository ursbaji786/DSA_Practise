package day2;

public class DiamondPattern {
	
	public void myMethod(int input) {
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
