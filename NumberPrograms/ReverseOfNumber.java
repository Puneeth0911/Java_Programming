package NumberPrograms;

public class ReverseOfNumber {
	public static void main(String[] args) {
		int n=123,reverse=0;
		while(n!=0) {
			int d=n%10;
			reverse=reverse*10+d;
			n/=10;
		}
		System.out.println(reverse);
	}
}
