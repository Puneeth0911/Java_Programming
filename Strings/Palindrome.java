package Strings;

public class Palindrome {
	public static void main(String[] args) {
		String str = "Madam";
		str = str.toLowerCase();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		System.out.println("----------");
		if(isPalindrome(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		stringBuilder(str);
		reverse(str);
	}
	
	public static boolean isPalindrome(String str) {
		int f=0, l=str.length()-1;
		while(f<=l) {
			if(str.charAt(f)!=str.charAt(l))
				return false;
			f++;
			l--;
		}
		return true;  
	}
	
	public static void stringBuilder(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();
		if(str.equals(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
	
	public static void reverse(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			s=str.charAt(i)+s;
		}
		System.out.println("Reverse: "+s);
	}
}