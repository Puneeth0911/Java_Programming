package NumberPrograms;

public class IndividualDigits {
	public static void main(String[] args) {
		int n=123;
		while(n!=0) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}
		System.out.println("-------------");
		individualDigit();
	}
	public static void individualDigit() {
		int n=123;
		for(;n!=0;) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}
	}
}
