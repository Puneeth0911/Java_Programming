package NumberPrograms;

import java.util.Scanner;

public class PerfectNo_SumOfFactorsEqualsNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		//6=1+2+3
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
		
		if(PerfectNo_SumOfFactorsEqualsNumber.isPerfectNo(n)==n) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not perfect number");
		}
		if(PerfectNo_SumOfFactorsEqualsNumber.isPerfectNo1(n)) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not perfect number");
		}
		System.out.println(PerfectNo_SumOfFactorsEqualsNumber.isPerfectNo2(n));
		sc.close();
	}
	
	public static int isPerfectNo(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static boolean isPerfectNo1(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum==n;
	}
	
	public static String isPerfectNo2(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) 
			return "Perfect number";
		else 
			return "Not perfect number";
	}
}
