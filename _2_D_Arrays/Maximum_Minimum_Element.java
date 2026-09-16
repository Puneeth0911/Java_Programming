package _2_D_Arrays;

public class Maximum_Minimum_Element {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]>max)
					max=arr[i][j];
				if(arr[i][j]<min)
					min=arr[i][j];
			}
		}
		System.out.println("Minimum element: "+min);
		System.out.println("Maximum element: "+max);
	}
}
