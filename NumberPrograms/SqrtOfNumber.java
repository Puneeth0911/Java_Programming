package NumberPrograms;

public class SqrtOfNumber {
	public static void main(String[] args) {
		int n=25,j=0;
		boolean res=false;
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) {
				res=true;
				j=i;
				break;
			}
		}
		if(res)
			System.out.println("Square root: "+j);
		else
			System.out.println("Not square root");
//		System.out.println(Math.sqrt(25));
	}
}
