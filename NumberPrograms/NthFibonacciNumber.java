package NumberPrograms;

public class NthFibonacciNumber {
	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,res=0;
		for(int i=1; ;i++) {
			if(n==i) {
				System.out.println(res);
				break;
			}
			res=a+b;
			a=b;
			b=res;
		}
	}
}
