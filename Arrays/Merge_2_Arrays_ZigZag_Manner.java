package Arrays;

import java.util.Arrays;

public class Merge_2_Arrays_ZigZag_Manner {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10, 11 };
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0;
		for (int k = 0; k < c.length; k++) {
			if (k % 2 == 0) {
				if (i < a.length) {
					c[k] = a[i];
					i++;
				} 
				else if (j < b.length) {
					c[k] = b[j];
					j++;
				}
			} else {
				if (j < b.length) {
					c[k] = b[j];
					j++;
				} 
				else if (i < a.length) {
					c[k] = a[i];
					i++;
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
