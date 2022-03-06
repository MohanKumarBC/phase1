package Lesson4;

public class MainOS1 {
		public static void main(String[] args) {
			OrderStatistics ob = new OrderStatistics(); 
	        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
	        int n = arr.length,k = 4; 
	        System.out.println("K'th smallest element is "+ ob.OrderStatistics(arr, 0, n-1, k)); 
	    }
	}


