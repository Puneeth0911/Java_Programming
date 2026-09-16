package Arrays;

import java.util.Arrays;
public class Sorting {
	public static void main(String[] args) {
		int arr[]= {10,5,7,1,2,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr);  //[I@65b3120a
		System.out.println(Arrays.toString(arr)); //[1, 2, 5, 7, 9, 10]
	}
}
