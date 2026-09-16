package NumberPrograms;

public class GCD_GreatestCommomDivisor {
	public static void main(String[] args) {
		int a=8,b=16,gcd=0;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
}
