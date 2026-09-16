package NumberPrograms;

public class Tech_SquareOfHalfSumsEqualsNumber {
	public static void main(String[] args) {
		int n=2025, count=0, temp=n;
		while(n!=0) {
			n/=10;
			count++;
		}
		if(count%2==0) {
			int pow=1;
			for(int i=1;i<=count/2;i++) {
				pow=pow*10;
			}
			int n1=temp%pow;
			int n2=temp/pow;
			int sum=n1+n2;
			if(sum*sum==temp)
				System.out.println("Tech Number");
			else
				System.out.println("Not tech number");
		}
	}
}
    





