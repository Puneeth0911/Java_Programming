package NumberPrograms;

public class CountIndividualDigits {
	public static void main(String[] args) {
		int n=123;
		int count=0;
		while(n!=0) {
			int d=n%10;
//			System.out.println(d);
			count++;
			n=n/10;
		}
		System.out.println("Count of Individual Digits: "+count);
	}
}
