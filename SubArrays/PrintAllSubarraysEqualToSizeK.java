package SubArrays;

public class PrintAllSubarraysEqualToSizeK {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int n = 3;
		for (int i = 0; i <= a.length - n; i++) {
			for (int j = i; j < i + n; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		printAllSubarrayEqualToSizeK(a, n); 
	}

	public static void printAllSubarrayEqualToSizeK(int a[], int n) {
		for (int i = 0; i < a.length; i++) {  
			for (int j = i; j < a.length; j++) {
				if (j - i == n - 1) {
					for (int k = i; k <= j; k++) {
						System.out.print(a[k] + " ");
					}
					System.out.println();
				}
			}
		}
	}
}
