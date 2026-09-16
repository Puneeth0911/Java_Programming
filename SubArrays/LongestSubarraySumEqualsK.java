package SubArrays;

public class LongestSubarraySumEqualsK {
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1, 1};
        int k = 4;
        int maxLength = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == k) {
                    int length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                    }  
                }
            }
        }
        System.out.println("Longest length = " + maxLength);
    }
}