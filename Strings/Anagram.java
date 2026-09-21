package Strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "care";
		String s2 = "race";
		System.out.println(isAnagram(s1, s2));
	}
	public static String isAnagram(String s1,String s2) {
		if (s1.length() != s2.length()) {
			return "Not anagram";
		} else {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean res=Arrays.equals(ch1, ch2);
			if(res)
				return "Anagram";
			else 
				return "Not Anagram";
		}
	}
}
