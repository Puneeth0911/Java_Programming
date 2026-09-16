package NumberPrograms;

import java.util.Scanner;

public class PrimeNoGivenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int start=sc.nextInt();
		System.out.println("Enter ending number: ");
		int end=sc.nextInt();
		for(int j=start;j<=end;j++) {
			if(isPrime(j)) {
				System.out.println(j);
			}
		}
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



/*for(int i=start;i<=end;i++) {
	int count=0;
	for(int j=1;j<=i;j++) {
		if(i%j==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println(i);
	}
}*/