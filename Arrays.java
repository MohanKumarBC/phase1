package FortyPgms;

public class Arrays {
	public static void main(String[] args) {

		//single-dimensional array
		int ar[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.print(ar[i]+" ");
		}


		//multidimensional array
		int[][] br = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 2: " + br[1].length);
		      }
}
