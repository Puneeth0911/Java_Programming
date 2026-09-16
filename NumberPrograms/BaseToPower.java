package NumberPrograms;

public class BaseToPower {
	public static void main(String[] args) {
		int base=2,power=3,res=1;
		for(int i=1;i<=power;i++) {
			res=res*base;
		}
		System.out.println(res);
		baseToPower();
	}
	public static void baseToPower() {
		int base=2,power=3,res=1;
		while(power>0) {
			res=res*base;
			power--;
		}
		System.out.println(res);
	}
}
