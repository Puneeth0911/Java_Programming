package NumberPrograms;

public class ArmstrongNumber_SumOfDigitsPowerNumberOfDigits {
	public static void main(String[] args) {
		int n=153,count=0,temp=n,sum=0,temp2=n;
		while(n!=0) {
			n/=10;
			count++;
		}
		while(temp!=0) {
			int d=temp%10;
			sum+=(int)Math.pow(d, count);
			temp/=10;
		}
		if(sum==temp2) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
		
		if(extractDigit(temp2)) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}
	public static boolean extractDigit(int n){
		int sum=0, temp=n, digitscount=count(n);
		while(n!=0) {
			int d=n%10;
			sum+=power(d,digitscount);
			n/=10;
		}
		return sum==temp;
	}
	public static int count(int n) {
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return count;
	}
	public static int power(int base,int power) {
		int pow=1;
		for(int i=1;i<=power;i++) {
			pow=pow*base;
		}
		return pow;
	}
}
