package _2_D_Arrays;

public class Primary_Secondary_Diagonal {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		primaryDiagonal(arr);
		secondaryDiagonal(arr);
	}

	public static void primaryDiagonal(int arr[][]) {
		System.out.print("Primary diagonal elements:");
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					System.out.print(" "+arr[i][j]);
				}
			}
		}
	}
	
	public static void secondaryDiagonal(int arr[][]) {
		System.out.print("\nSecondary diagonal elements:");
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				if(i+j==arr.length-1) {
					System.out.print(" "+arr[i][j]);
				}
			}
		}
	}
}
