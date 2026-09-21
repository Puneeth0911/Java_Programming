package Strings;

public class Swap_Strings {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		using_third_variable(s1, s2);
	}
	public static void using_third_variable(String s1,String s2) {
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println(s1);
		System.out.println(s2);
	}  
	public static void without_third_variable(String s1,String s2) {
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2); 
	}
			
}
