package Strings;

public class Character_Word_Number_Addition {
	public static void main(String[] args) {
		String s1="hello 9 and 8";
		String s2="Hello 18 and 20 and 8 and 10";
		character_No_Addition(s1);
		word_No_Addition(s2);
	}
	public static void character_No_Addition(String s1) {
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
				sum+=s1.charAt(i)-'0';
			}
		}
		System.out.println("Character sum: "+sum);
	}
	public static void word_No_Addition(String s2) {
		String[] words=s2.split(" ");
		int sum=0;
		for(String word:words) {
			try {
				sum+=Integer.parseInt(word);
			} catch(NumberFormatException e) {
				
			}
		}
		System.out.println("Word no. addition: "+sum);
	}
}
