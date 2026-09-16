package Arrays;

public class Highest_Sum_of_2_Numbers {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.println(highestSum(arr));
	}
	public static int highestSum(int arr[]) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
				second=arr[i];
		}
		int sum=first+second;
		return sum;
	}
}
