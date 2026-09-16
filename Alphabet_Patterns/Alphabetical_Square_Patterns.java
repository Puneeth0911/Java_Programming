package Alphabet_Patterns;

public class Alphabetical_Square_Patterns {
	public static void main(String[] args) {
		int n=5;
		/*for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}*/ 
//		A B C D E 
//		A B C D E
//		A B C D E 
//		A B C D E 
//		A B C D E 
		
		/*char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}*/
//		A A A A A 
//		B B B B B 
//		C C C C C 
//		D D D D D 
//		E E E E E 
		
		/*char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}*/
//		A B C D E 
//		F G H I J 
//		K L M N O 
//		P Q R S T 
//		U V W X Y
		
		for(int i=1;i<=n;i++) {
			char ch=(char)('A'+i-1);
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
				ch+=n;
			} 
			ch++;
			System.out.println();
		}
//		A F K P U
//		B G L Q V 
//		C H M R W 
//		D I N S X 
//		E J O T Y 
	}
}
