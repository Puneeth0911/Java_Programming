package Searching_And_Sorting;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int arr[]= {5,4,2,1,3};
		System.out.println(Arrays.toString(sorting(arr)));
		System.out.println();
	}
	public static int[] sorting(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
