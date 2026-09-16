package NumberPrograms;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
		PrimeNo.isPrime(n);
		sc.close();

	}
	public static void isPrime(int n) {
		boolean result=true;
		if(n<2) {
			System.out.println("Not prime");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					result=false;
				}
			}
			if(result) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not a prime number");
			}
		}
	}
}
