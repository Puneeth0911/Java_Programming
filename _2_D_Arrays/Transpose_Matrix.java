package _2_D_Arrays;

import java.util.Arrays;

public class Transpose_Matrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }      
        }     
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------");
        int[][] result=transposeMatrix(arr);
        for(int i=0;i<result.length;i++) {
        	System.out.println(Arrays.toString(result[i]));
        }  
	}
	public static int[][] transposeMatrix(int arr[][]) {
		int rows=arr.length;
		int cols=arr[0].length;
		int[][] transpose=new int[cols][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i]=arr[i][j];
			}
		}
		return transpose;
	}
}
