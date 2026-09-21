package Strings;

import java.util.Scanner;

public class Remove_Replace_Character {
	public static void main(String[] args) {
		String s="Hello World";
		removeCharacter(s);
		replaceCharacter(s);
	}
	public static void removeCharacter(String s) {
		String str="";
		System.out.println("Enter a character to remove: ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=ch) {
				str+=s.charAt(i);
			}
		}      
		System.out.println(str);   
	}
	public static void replaceCharacter(String s) { 
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter character which you want to replace: ");
		char old=sc.next().charAt(0);
		System.out.println("Enter new character: ");
		char neww=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=old) {
				str+=s.charAt(i);
			} else {
				str+=neww;
			}	
		} 
		System.out.println(str);
	}
}
