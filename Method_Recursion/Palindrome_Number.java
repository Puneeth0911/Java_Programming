package Method_Recursion;

public class Palindrome_Number {
	public static void main(String[] args) {
		int n=121;
		reverse(n);
		if(n==rev) 
			System.out.println("Palindrome");
		else 
			System.out.println("Not palindrome");
	}
	static int rev=0;
	public static void reverse(int n) {
		if(n==0)
			return;
		rev=rev*10+n%10; 
		reverse(n/10);
	}
}
