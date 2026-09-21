package Strings;

public class Longest_Palindrome_In_Sentence {
	public static void main(String[] args) {
		String s="madam teaches malayalam next level";
		String str="";
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++) {
			if(isPalindrome(st[i])) {
				if(st[i].length()>str.length()) {
					str=st[i];
				}
			}
		}
		System.out.println(str+" -> "+str.length());
	}
	public static boolean isPalindrome(String s) {
		int f=0,l=s.length()-1;
		while(f<l) {
			if(s.charAt(f)!=s.charAt(l)) {
				return false;
			}
			f++;
			l--;
		}
		return true;
	}
}
