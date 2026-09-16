package Arrays;

import java.util.Arrays;

public class Merge_2_Arrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		int c[]=new int[a.length+b.length];
		int i=0,j=0;
		for(int k=0;k<c.length;k++) {
			if(i<a.length) {
				c[k]=a[i];
				i++;
			} else if(j<b.length) {
				c[k]=b[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
