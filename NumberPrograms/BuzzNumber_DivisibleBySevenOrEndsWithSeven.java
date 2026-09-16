package NumberPrograms;

public class BuzzNumber_DivisibleBySevenOrEndsWithSeven {
	public static void main(String[] args) {
		int n=14;
		if(n%10==7 || n%7==0) {
			System.out.println("Buzz number");
		}
		else {
			System.out.println("Not Buzz number");
		}
	}
}
