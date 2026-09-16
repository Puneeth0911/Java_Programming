package Method_Recursion;

public class Strong_Number_145_DigitsFactorialSum {
	public static void main(String[] args) {
		int n=145;
		strong(n);
		if(n==sum) 
			System.out.println("Strong number");
		else 
			System.out.println("Not strong number");
	}
	static int sum=0;
	public static int factorial(int n) {
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static void strong(int n) {
		if(n==0)
			return;
		int digit=n%10;
		sum+=factorial(digit);
		strong(n/10);
	}
}
