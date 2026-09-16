package Arrays;

public class Distinct_Unique_Elements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,1,2,5,1,2,4,1,7,2,5,9,6,2};
		for(int i=0;i<arr.length;i++) {
			boolean visited=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					visited=true;
					break;
				} 
			}
			if(!visited)
				System.out.print(arr[i]+" ");
		}
	}
}
