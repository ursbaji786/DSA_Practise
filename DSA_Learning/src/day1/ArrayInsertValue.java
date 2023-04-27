package day1;

public class ArrayInsertValue {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,5,10};
        int index = 2;
        int value = 55;
 
        for(int i=a.length-1; i>index; i--)
        {
            a[i]=a[i];
        }
        a[index]=value;
        //print values
        for(int i=0; i<a.length; i++)
        System.out.print(a[i] +"," );
    
	}

}
