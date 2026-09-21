package Strings;

public class Program2 {
	public static void main(String[] args) {
		String s="Hellooo1$";
		printLast4Characters(s);
		System.out.println("Characters to upper case: "+printCharactersInUpperCaseWithoutInbuilt(s));
		System.out.println(countUppercaseLowercaseNumberSpecialCharacters(s));
		System.out.println(countVowelsConsonentsNumberSpecialCharacters(s));
	}
	public static void printLast4Characters(String s) {
		System.out.println("Last 4 characters: "+s.substring(s.length()-4));
	}
	public static String printCharactersInUpperCaseWithoutInbuilt(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				str+=(char)(ch-32);
			} else {
				str+=ch;
			}
		}
		return str;
	}
	public static String countUppercaseLowercaseNumberSpecialCharacters(String s) {
		int upper=0,lower=0,number=0,special=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				upper++;
			else if(ch>='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
				number++;
			else
				special++;
		}
		return "Upper case count: "+upper+", Lower case count: "+lower+", Numbers count: "+number+", Special characters count: "+special;
	}
	public static String countVowelsConsonentsNumberSpecialCharacters(String s) {
		int vowels=0,consonents=0,number=0,special=0;
		String str="AEIOUaeiou";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				if(str.contains(ch+"")) {
					vowels++;
				} else {
					consonents++;
				}
			} 
			else if(ch>='0' && ch<='9')
				number++;
			else
				special++;
		}  
		return "Vowels count: "+vowels+", Consonents count: "+consonents+", Numbers count: "+number+", Special characters count: "+special;
	} 
}
