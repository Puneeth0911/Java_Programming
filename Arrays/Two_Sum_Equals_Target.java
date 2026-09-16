package Arrays;

public class Two_Sum_Equals_Target {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 10, 3};
		int target = 9;
		boolean found=false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i]);
					System.out.println(arr[j]);
					found=true;
					break;
				}
			}
			if (found) {
                break;
            }
		}
		if (!found) {
			System.out.println("Not found");
		}
	}
}
