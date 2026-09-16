package NumberPrograms;

public class Harshad_DivisibleByItsDigitSum {
	public static void main(String[] args) {
		int n=18, sum=0, temp=n;
//		18%(1+8)=0
		while(n!=0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		if(temp%sum==0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not Harshad Number");
		}
	}
}
