package _2_D_Arrays;
       
public class Count_Even_Odd_Elements {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int evenCount=0, oddCount=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]%2==0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
			}
		}
		System.out.println("Even count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
	}
}
