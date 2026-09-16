package NumberPrograms;

public class FirstDigitEvenOrOdd {
	public static void main(String[] args) {
		int n=25176;
		while(n>9) {
			n/=10;
		}
		System.out.println("First digit: "+n);
		if(n%2==0) {
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
	}
}
