package Searching_And_Sorting;

import java.util.Arrays;

public class Binary_Search {
	public static void main(String[] args) {
		int[] arr= {1,5,2,7,4};
		int target=7;
		System.out.println(binarySearch(arr, target));
	}
	public static int binarySearch(int arr[], int target) {
		Arrays.sort(arr);
		int f=0, l=arr.length-1;
		while(f<=l) {
			int mid=(f+l)/2;
			if(arr[mid]==target)
				return mid;
			else if(target>arr[mid])
				f=mid+1;
			else if(target<arr[mid])
				l=mid-1; 
		}
		return -1;
	}
}
