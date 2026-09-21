package Strings;

import java.util.Arrays;
  
public class Count_No_Of_Words_Spaces {
	public static void main(String[] args) {
		String s=" Hello world welcome to java programming";
		String ss=s.trim(); 
		String str[]=ss.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++) {
			count++;
		}
		System.out.println("Words count: "+count);
		System.out.println("Words count: "+countNoOfWords(s));
		System.out.println("Spaces count: "+countNoOfSpaces(s));
	}  
	public static int countNoOfWords(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(i==0 && s.charAt(i)!=' ' || s.charAt(i)!=' ' && s.charAt(i-1)==' ')
				count++;
		}
		return count;
	}
	
	public static int countNoOfSpaces(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') 
				count++;
		}
		return count;
	}
}
