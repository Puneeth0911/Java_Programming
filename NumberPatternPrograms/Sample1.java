package NumberPatternPrograms;

public class Sample1 {
	public static void main(String[] args) {
		int n=5;
		/*for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k=k+n;  
			}
			System.out.println();
		}*/  
//		1 6 11 16 21 
//		2 7 12 17 22 
//		3 8 13 18 23 
//		4 9 14 19 24 
//		5 10 15 20 25 
		
		
		/*int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}*/
//		1 2 3 4 5 
//		6 7 8 9 10 
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25
		
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5
		
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5
		
		
		/*int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}*/
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15
		
		
		/*for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k=k+n-j;
			} 
			System.out.println();
		}*/
//		1 
//		2 6 
//		3 7 10 
//		4 8 11 13 
//		5 9 12 14 15
		
		
		/*int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(k%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
				k++;
			}
			System.out.println();
		}*/
//		1 
//		0 1 
//		0 1 0 
//		1 0 1 0 
//		1 0 1 0 1 
		
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) 
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}*/
//		1 
//		0 0 
//		1 1 1 
//		0 0 0 0 
//		1 1 1 1 1 
		
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) 
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}*/
//		0 
//		1 1 
//		0 0 0 
//		1 1 1 1 
//		0 0 0 0 0 
		
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) 
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}*/
//		1 
//		1 0 
//		1 0 1 
//		1 0 1 0 
//		1 0 1 0 1 
		
		
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
//	     5
//	    54
//	   543
//	  5432
//	 54321   

		
	}
}
