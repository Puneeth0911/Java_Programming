package SubArrays;

public class SumOfAllSubarraysEqualToSizeK {
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 3;
        int total = 0;
        for (int i = 0; i <= a.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + a[j];
            }
            total = total + sum;
        }
        System.out.println("Sum = " + total);
        System.out.println("-------------");
        sumOfSubarrayEqualsSizeK(a, k);
    }
	public static void sumOfSubarrayEqualsSizeK(int a[], int k) {
		for(int i=0;i<=a.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				System.out.print(a[j]+" ");
				sum+=a[j];
			}
			System.out.println("Sum: "+sum);
		}
	}
}
