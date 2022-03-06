package practice.Proj;
public class LongestIncreasingSubsequent {
	public static int LIS(int[] arr,int i,int n,int prev){
		if(i==n){
			return 0;
		} 
		int excl = LIS(arr,i+1,n,prev);
		int incl=0;
		if(arr[i] > prev){
			incl = 1+LIS(arr,i+1,n,arr[i]);
		}
		return Integer.max(incl, excl);
	}
	public static void main(String[] args){
		int[] arr={1,5,7,8,9,65,48,78,89,45,62,32,14};
		System.out.println("the length of the LIS is" +LIS(arr,0,arr.length,Integer.MIN_VALUE));
		
	}
}
