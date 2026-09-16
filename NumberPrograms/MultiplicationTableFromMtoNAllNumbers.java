package NumberPrograms;

public class MultiplicationTableFromMtoNAllNumbers {
	public static void main(String[] args) {
		int m=2,n=4;
		for(int i=m;i<=n;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}
