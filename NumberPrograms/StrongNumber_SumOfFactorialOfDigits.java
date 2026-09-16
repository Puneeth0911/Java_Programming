package NumberPrograms;

public class StrongNumber_SumOfFactorialOfDigits {
	public static void main(String[] args) {
		int n=145;
//		1!+4!+5!=1+24+120=145
		if(extractDigit(n)==n) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
	}
	public static int factorial(int n) {
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		return factorial;
	}
	public static int extractDigit(int n) {
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum+=factorial(d);
			n/=10;
		}
		return sum;
	}
}


/*import java.util.Scanner;
public class StrongNo {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println(isStrong(n));
	}
	public static String isStrong(int n) {
	    int temp=n,sum=0;
	    while(n!=0) {
	        int d=n%10;
	        sum+=factorial(d);
	        n/=10;
	    }
	    if(sum==temp) {
	        return "Strong";
	    }
	    else{
	        return "Not strong";
	    }
	}
	public static int factorial(int n) {
	    int factorial=1;
	    for(int i=1;i<=n;i++) {
	        factorial*=i;
	    }
	    return factorial;
	}
}*/
