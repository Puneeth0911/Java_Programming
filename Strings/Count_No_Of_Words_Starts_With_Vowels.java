package Strings;

public class Count_No_Of_Words_Starts_With_Vowels {
	public static void main(String[] args) {
		String s="apple banana orange mango";
		String[] words=s.split(" ");
		int count=0;
		for(String word:words) {
			char ch=word.charAt(0);
			if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' ||ch=='I' || ch=='O' || ch=='U') {
				count++;
			}  
		}
		System.out.println(count);
	}
}
