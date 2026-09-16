package NumberPrograms;

import java.util.Scanner;

public class ForWhileLoopScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for for loop: ");
		int n=sc.nextInt();
		System.out.println("Enter value for while loop: ");
		int m=sc.nextInt();
		ForWhileLoopScanner.printNum(n);
		System.out.println();
		ForWhileLoopScanner.printNum1(m);
		sc.close();
	}
	public static void printNum(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
	public static void printNum1(int m) {
		int i=1;
		while(i<=m) {
			System.out.print(i+" ");
			i++;
		}
	}
	
}
