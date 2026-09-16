 package SubArrays;

public class MaxSumOfAllSubarray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum = sum + a[j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println("Maximum sum = " + max);
		System.out.println("------------");
		System.out.println(kadanesAlgorithm(a));
	}

	public static int kadanesAlgorithm(int a[]) {
		int current = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			current = Math.max(a[i], current + a[i]);
			max = Math.max(current, max);
		}
		return max;
	}
}
