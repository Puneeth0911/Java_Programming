package NumberPrograms;

public class SmallestBiggestDigitOfNumber {
	public static void main(String[] args) {
		int n=983;
		int smallest=Integer.MAX_VALUE;
//		int smallest=9;
//		int smallest=n;
		int biggest=Integer.MIN_VALUE;
		while(n!=0) {
			int d=n%10;
			if(d<smallest) {
				smallest=d;
			}
			if(d>biggest) {
				biggest=d;
			}
			n/=10;
		}
		System.out.println("smallest: "+smallest);
		System.out.println("biggest: "+biggest);

	}
}
