package day1;

public class Pyramid {
	
	public void myMethod(int input) {
		int i,j;
		 for (i=0; i<input; i++){
			 
		        for (j=input-i; j>1; j--){
		           System.out.print(" ");
		        }
		        
		        for (j=0; j<=i; j++ ){
		           System.out.print("* ");
		        }
		        System.out.println();
		      }
		
	}

	public static void main(String[] args) {
		
		int input = 5; // number of rows
		Pyramid p = new Pyramid();
		p.myMethod(input);
		

	}

}
