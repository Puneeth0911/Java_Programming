package NumberPrograms;

public class AutomorphicNumber_SquareEndsWithNumberItself {
	public static void main(String[] args) {
		int n=5;
//		5*5=25 contains 5 at end
		System.out.println(automorphic(n));
	}
	public static String automorphic(int n) {
		int sq=n*n;
		while(n>0) {
			if(n%10!=sq%10) 
				return "Not automorphic number";
			n/=10;
			sq/=10;
		}
		return "Automorphic number";
	}
}
