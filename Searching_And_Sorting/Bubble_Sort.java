package Searching_And_Sorting;

import java.util.Arrays;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] arr= {5,3,4,1,2};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}           
	public static int[] bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
