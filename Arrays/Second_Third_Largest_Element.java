package Arrays;

public class Second_Third_Largest_Element {
	public static void main(String[] args) {
//		int arr[]= {10};
		int arr[] = { 2, 5, 1, 3, 7, 12 };
		int secondLargest=secondLargestElement(arr);
		System.out.println("Second largest: " + secondLargest);
		//thirdLargestElement(arr);
	}

	public static int secondLargestElement(int arr[]) {
		int secondLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		if(arr.length<2)
			return -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest==Integer.MIN_VALUE ? -1: secondLargest;
	}

	public static void thirdLargestElement(int arr[]) {
		int thirdLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				thirdLargest=secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i]>secondLargest && arr[i]!=largest) {
				thirdLargest=secondLargest;
				secondLargest=arr[i];
			} else if(arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=largest) {
				thirdLargest=arr[i];
			}
		}
		System.out.println("Third Largest: "+thirdLargest);
	}
}
