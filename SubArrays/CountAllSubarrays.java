package SubArrays;

public class CountAllSubarrays {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				count++;
			}
		}
		System.out.println(count);
	}
}
