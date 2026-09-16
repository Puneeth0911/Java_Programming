package NumberPrograms;

public class SumOfN {
	public static void main(String[] args) {
		int n=5;
		System.out.println(SumOfN.sumOfN(n)); //15
	}
	public static String sumOfN(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum+" ";
	}
}
