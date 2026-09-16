package NumberPrograms;

public class DisariumNumber_DigitsRaisedToPositionSumEqualsNumber {
	public static void main(String[] args) {
		int n=135,count=0,temp=n,sum=0,temp2=n;
//		1¹ + 3² + 5³ = 1 + 9 + 125 = 135
		while(n!=0) {
			n/=10;
			count++;
		}
		while(temp!=0) {
			int d=temp%10;
			sum+=(int)Math.pow(d, count--);
			temp/=10;
		}
		if(sum==temp2) {
			System.out.println("Disarium number");
		}
		else {
			System.out.println("Not Disarium number");
		}
		System.out.println(extractDigit(175));
		
	}
	public static String extractDigit(int n){
		int sum=0, temp=n, digitscount=count(n);
		while(n!=0) {
			int d=n%10;
			sum+=power(d,digitscount--);
			n/=10;
		}
		if(sum==temp)
			return "Disarium number";
		else
			return "Not Disarium number";
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
