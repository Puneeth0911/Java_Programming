package Method_Recursion;

public class ReverseAGivenNumber {
	public static void main(String[] args) {
		reverseGivenNum(1234);
		System.out.println(reverse);
	}
	static int reverse=0;
	public static void reverseGivenNum(int n) {
		if(n==0) return;
		reverse=reverse*10+n%10;
		reverseGivenNum(n/10);
	}
}