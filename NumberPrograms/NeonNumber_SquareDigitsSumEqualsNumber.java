package NumberPrograms;

public class NeonNumber_SquareDigitsSumEqualsNumber {
	public static void main(String[] args) {
		int n=9;
//		9*9=81(8+1=9)
		int sq=n*n;
		int sum=0;
		while(sq!=0) {
			int d=sq%10;
			sum+=d;
			sq/=10;
		}
		if(sum==n)
			System.out.println("Neon Number");
		else
			System.out.println("Not neon number");
	}
}
