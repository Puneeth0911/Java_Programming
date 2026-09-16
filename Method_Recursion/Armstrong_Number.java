package Method_Recursion;

public class Armstrong_Number {
	public static void main(String[] args) {
		int n=153;
		armstrong(n);
		if(n==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
	}    
	static int sum=0;
	public static void armstrong(int n) {
		if(n==0)
			return;
		int digit=n%10;
		sum+=digit*digit*digit;
		armstrong(n/10);
	}
}
