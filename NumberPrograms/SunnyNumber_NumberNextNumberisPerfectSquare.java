package NumberPrograms;

public class SunnyNumber_NumberNextNumberisPerfectSquare {
	public static void main(String[] args) {
		int n=48;
		int newNum=n+1;
		int sqrt=(int)Math.sqrt(newNum);
		if(sqrt*sqrt==newNum) 
			System.out.println("Sunny number");
		else
			System.out.println("Not sunny number");
	}
}
