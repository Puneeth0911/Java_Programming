package NumberPrograms;

import java.util.Scanner;

public class NthPrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int count=0;
		for(int j=1; ;j++) {
			if(isPrime(j)==true) {
				count++;
			}
			if(count==n) {
				System.out.println(j);
				break;
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

/*import java.util.Scanner;
public class NthPrimeNo {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println(isPrime(n));
	}
	public static int isPrime(int n) {
	    int count=0,i=0;
	    for(i=1;;i++) {
	        if(isPrimeno(i)==1) {
	           count++;
	        }
	        if(count==n) {
	            return i;
	        }
	    }
	}
	public static int isPrimeno(int n) {
	    int count=0;
	    for(int j=1;j<=n;j++) {
	        if(n%j==0) {
	            count++;
	        }
	    }
	    if(count==2) {
	        return 1;
	    }
	    return 0;
	}
}
*/
/*public static boolean isPrimeno(int n) {
		if(n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}*/



/*int n = 10;
        int prime = 0, num = 2;
        while (prime < n) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime++;
            }
            if (prime == n) {
                System.out.println("Nth prime number is: " + num);
            }
            num++;
        }*/
