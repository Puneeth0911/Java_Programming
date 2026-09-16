package Searching_And_Sorting;

public class Linear_Search {
	public static void main(String[] args) {
		int arr[]= {10,5,7,1,2,9};
		int key=1;
		System.out.println(linear(arr,key));
	}
	public static int linear(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
