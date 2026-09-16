package NumberPrograms;

public class XylemPhloem_ExtremeDigitSumEqualsMiddleDigitSum {
	public static void main(String[] args) {
		int n=1234, sum=0;
//		1+4=2+3
		int d=n%10;
		n/=10;
		while(n>9) {
			int d1=n%10;
			sum+=d1 ;
			n/=10;
		}
		n=n+d;
		if(sum==n) {
			System.out.println("Xylem number");
		}
		else {
			System.out.println(	"Phloem number");
		}
	}
}
