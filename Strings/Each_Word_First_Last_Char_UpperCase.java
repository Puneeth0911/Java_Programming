package Strings;

public class Each_Word_First_Last_Char_UpperCase {
	public static void main(String[] args) {
		String s="hello world welcome to java programming";
		firstCharUpperCase(s);
		System.out.println();
		lastCharUpperCase(s);
	}
	public static void firstCharUpperCase(String s) {
		String[] words=s.split(" ");
		for(String word:words) {
			System.out.print(Character.toUpperCase(word.charAt(0))+word.substring(1)+" ");
		}
	}
	public static void lastCharUpperCase(String s) {
		String[] words=s.split(" ");       
		for(String word:words) {
			System.out.print(word.substring(0,word.length()-1)+Character.toUpperCase(word.charAt(word.length()-1))+" ");
		} 
	}
}