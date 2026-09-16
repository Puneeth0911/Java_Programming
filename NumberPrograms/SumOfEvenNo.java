package NumberPrograms;

public class SumOfEvenNo {
	public static void main(String[] args) {
		int start=10,end=20,sum=0;
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);		
	}
}
