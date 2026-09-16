package NumberPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int a=0,b=1;
		while(a<=n) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
