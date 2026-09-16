package _2_D_Arrays;

import java.util.Arrays;

public class Each_Row_Column_Largest_Element {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(eachRowLargestElement(arr)));
		System.out.println(Arrays.toString(eachColumnLargestElement(arr)));
	}
 
	public static int[] eachRowLargestElement(int[][] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max)
					max = arr[i][j];
			} 
			result[i] = max;
		}
		return result;
	}
	
	public static int[] eachColumnLargestElement(int[][] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int max = arr[0][i];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] > max)
					max = arr[j][i];
			}
			result[i] = max;
		}
		return result;
	}
}
