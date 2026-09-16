package Arrays;

import java.util.Arrays;

public class Insert_Element_Particular_Position {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length+1];
		int index=2, element=100;
		for(int i=0,j=0;i<a.length;i++) {
			if(i==index) {
				b[j++]=element;
			}   
			b[j++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
