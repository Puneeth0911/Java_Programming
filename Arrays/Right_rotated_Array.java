package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Right_rotated_Array {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		int positions=sc.nextInt();
		for(int i=0;i<positions;i++) {
			int element=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=element;
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
