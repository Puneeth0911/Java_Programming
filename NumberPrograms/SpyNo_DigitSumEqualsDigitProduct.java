package NumberPrograms;

public class SpyNo_DigitSumEqualsDigitProduct {
	public static void main(String[] args) {
		int n=123;
//		1+2+3=1*2*3
		int sum=0,product=1;
		while(n!=0) {
			int d=n%10;
			sum+=d;
			product*=d;
			n/=10;
		}
		if(sum==product)
			System.out.println("spy number");
		else
			System.out.println("not spy number");
	}
}
