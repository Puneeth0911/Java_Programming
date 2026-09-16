package PatternPrograms;

import java.util.Scanner;

public class Simple1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==3 && j==3) {
					System.out.print("@ ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}*/
//		* * * * * 
//		* * * * * 
//		* * @ * * 
//		* * * * * 
//		* * * * * 
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n/2+1) {
					System.out.print("@ ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}*/
//		* * * * * 
//		* * * * * 
//		* * @ * * 
//		* * * * * 
//		* * * * * 
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==1&&j==2)||(i==1&&j==4)||(i==5&&j==2)||(i==5&&j==4)) {
					System.out.print("$ ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}*/
//		* $ * $ * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* $ * $ * 
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==3) {
					System.out.print("# ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}*/
//		* * * * * 
//		* * * * * 
//		# # # # # 
//		* * * * * 
//		* * * * * 

		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==3 || j==3) {
//					if condition =>i==n/2+1 || j==n/2+1
					System.out.print("@ ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}*/
//		* * @ * * 
//		* * @ * * 
//		@ @ @ @ @ 
//		* * @ * * 
//		* * @ * * 
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==5 || j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("! ");
				}
			}
			System.out.println();
		}*/
//		* * * * * 
//		* ! ! ! * 
//		* ! ! ! * 
//		* ! ! ! * 
//		* * * * * 
		
		sc.close();
	}
}
