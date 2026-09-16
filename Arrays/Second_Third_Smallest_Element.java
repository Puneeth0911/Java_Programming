package Arrays;

public class Second_Third_Smallest_Element {
	public static void main(String[] args) {
		int arr[]= {9, 2, 3, 1};
		secondSmallestElement(arr);
		thirdSmallestElement(arr);
	}
	public static void secondSmallestElement(int arr[]) {
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			} else if(arr[i]<secondSmallest && arr[i]!=smallest) {
				secondSmallest=arr[i];
			}	 
		}
		System.out.println("Second smallest: "+secondSmallest);
	}
	public static void thirdSmallestElement(int arr[]) {
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		int thirdSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				thirdSmallest=secondSmallest;
				secondSmallest=smallest;
				smallest=arr[i];
			} else if(arr[i]<secondSmallest && arr[i]!=smallest) {
				thirdSmallest=secondSmallest;
				secondSmallest=arr[i];
			} else if(arr[i]<thirdSmallest && arr[i]!=secondSmallest && arr[i]!=smallest) {
				thirdSmallest=arr[i];
			}
		}
		System.out.println("Third smallest: "+thirdSmallest);
	}
}