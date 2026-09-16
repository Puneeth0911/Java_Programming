package _2_D_Arrays;

public class Square_Matrix_Or_Not {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean square=true;
		for(int i=0;i<arr.length;i++) {
			if(arr.length!=arr[i].length) {
				square=false;
				break;
			}
		}
		if(square)
			System.out.println("Square matrix");
		else
			System.out.println("Not square matrix");
	}
}
