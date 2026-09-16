package Arrays;

public class Frequency_of_Occurence {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,1,2,5,1,2,4,1,7,2,5,9,6,2};
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]==Integer.MIN_VALUE)
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
			System.out.println(arr[i]+" -> "+count);
		}
	}
}
