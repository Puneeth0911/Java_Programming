package Arrays;

public class Missing_Element {
	public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		System.out.println(missingElement(arr));
	}
	public static int missingElement(int arr[]) {
		int n=arr.length+1;
		int actualSum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return actualSum-sum;
	}
}
