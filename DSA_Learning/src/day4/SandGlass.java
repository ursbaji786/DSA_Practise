package day4;

public class SandGlass {

	public static void main(String[] args) {
		
		int n=5;
		
		// outer loop to print upper part
		
		for(int i=1; i <=n ; i++) {
			// to print spaces
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			//to print stars
			
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 2nd outer loop to print Lower part
		
				for(int i=1; i <=n ; i++) {
					// to print spaces
					for(int j=1; j<=n-i; j++) {
						System.out.print(" ");
					}
					//to print stars
					
					for(int j=n-i+1; j<=n; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}


	}

}
