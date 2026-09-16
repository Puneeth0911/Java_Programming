package Searching_And_Sorting;

import java.util.Arrays;

public class Insertion_Sort {
	public static void main(String[] args) {
		int arr[]= {5,4,2,1,3};
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
	public static int[] insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		return arr;
	}
}
