package Method_Recursion;

public class BaseToPower {
	public static void main(String[] args) {
		baseToPower(2,3);
		System.out.println(res);  //8
	}
	static int res=1;
	public static void baseToPower(int base,int power) {
		if(power==0) return;
		res=res*base;
		baseToPower(base,power-1);
	}
}
