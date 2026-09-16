package NumberPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int factorial=1;
		for(int i=n;i>=2;i--) {
			factorial*=i;
		}
		System.out.println(factorial);
		sc.close();
	}
}



/*select * from emp where roumnum<=(uselect count(*)/2 from emp); */
