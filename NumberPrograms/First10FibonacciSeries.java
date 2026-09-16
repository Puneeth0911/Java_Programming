package NumberPrograms;

public class First10FibonacciSeries {
	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,res=1;
		for(int i=1;i<=n;i++) {
			System.out.print(res+" ");
			res=a+b;
			a=b;
			b=res;
		}
	}
}
