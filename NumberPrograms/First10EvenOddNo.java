package NumberPrograms;

public class First10EvenOddNo {
	public static void main(String[] args) {
		System.out.println("First 10 Even numbers");
		for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }
		System.out.println("-----------");
		System.out.println("First 10 odd numbers");
		for(int j=1;j<=10;j++) {
			System.out.println(j*2-1);
		}
	}
}
