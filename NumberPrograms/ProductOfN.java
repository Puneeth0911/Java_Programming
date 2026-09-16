package NumberPrograms;

public class ProductOfN {
	public static void main(String[] args) {
		int n=5,product=1;
		for(int i=n;i>=1;i--) {
			product*=i;
		}
		System.out.println(product);
	}
}
