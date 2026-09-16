package SubArrays;

public class MaxSumOfAllSubarrayEqualToSizeK {
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 3;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= a.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + a[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("Maximum sum = " + max);
    }
}