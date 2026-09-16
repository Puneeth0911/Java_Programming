package NumberPrograms;

import java.util.Scanner;

public class SumOfPrimeGivenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		int start=sc.nextInt();
		System.out.println("Enter ending number: ");
		int end=sc.nextInt();
		int sum=0;
		for(int j=start;j<=end;j++) {
			if(isPrime(j)) {
				sum+=j;
			}
		}
		System.out.println(sum);
		sc.close();
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
