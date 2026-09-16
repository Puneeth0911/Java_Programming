package SubArrays;

public class CountAllSubarraysEqualToSizeK {
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 3;
        int count = 0;
        for (int i = 0; i <= a.length - k; i++) {
            count++;
        }
        System.out.println("Count = " + count);
    }
}
