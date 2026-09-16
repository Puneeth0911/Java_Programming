package Arrays;

public class Program_2 {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 3, 7, 12 };
		printElements(arr);
		System.out.println();
		printEvenIndexElements(arr);
		System.out.println();
		printSumOfElements(arr);
		printProductOfElements(arr);
		reverseArray(arr);
		System.out.println();
		reverseArray_TwoPointerApproach(arr);
		System.out.println();
		copyArray(arr);
		System.out.println();
		largestElementInArray(arr);
		smallestElementInArray(arr);
	}

	public static void printElements(int arr[]) {
		System.out.print("Elements: [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}

	public static void printEvenIndexElements(int arr[]) {
		System.out.print("Even elements: [");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i]);
				if (i != arr.length - 2)
					System.out.print(" ");
			}
		}
		System.out.print("]");
	}

	public static void printSumOfElements(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum: " + sum);
	}

	public static void printProductOfElements(int arr[]) {
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		System.out.println("Product: " + product);
	}

	public static void reverseArray(int arr[]) {
		System.out.print("Reverse of Array: [");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			if (i != 0) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	public static void reverseArray_TwoPointerApproach(int arr[]) {
		System.out.print("Reverse of Array Two Pointer Approach: [");
		int first = 0, last = arr.length - 1;
		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	public static void copyArray(int arr[]) {
		System.out.print("Copied Array: [");
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
			System.out.print(arr2[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	public static void largestElementInArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Max element: " + max);
	}
	
	public static void smallestElementInArray(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Min element: "+min);
	}
}
