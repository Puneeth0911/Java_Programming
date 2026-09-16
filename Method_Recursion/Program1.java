package Method_Recursion;

public class Program1 {
	public static void main(String[] args) {
		print(3);
		System.out.println("\n----------");
		print1To5(1);
		System.out.println("\n----------");
		print5To1(5);
		System.out.println("\n----------");
		sumOfN(5);
		System.out.println(sum);  //15
		System.out.println("----------");  
		productOfN(5);
		System.out.println(product);  //120
	}

	public static void print(int n) {
		if (n == 0)
			return;
		System.out.print("Hii" + " "); // Hii Hii Hii
		print(n - 1);
	}

	public static void print1To5(int n) {
		if (n == 6)
			return;
		System.out.print(n + " "); // 1 2 3 4 5
		print1To5(n + 1);
	}

	public static void print5To1(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		print5To1(n - 1); // 5 4 3 2 1
	}

	static int sum = 0;
	public static void sumOfN(int n) {
		if (n == 0)
			return;
		sum += n;
		sumOfN(n - 1);
	
	}

	static int product = 1;
	public static void productOfN(int n) {
		if (n == 0)
			return;
		product *= n;
		productOfN(n - 1);
	}
}
