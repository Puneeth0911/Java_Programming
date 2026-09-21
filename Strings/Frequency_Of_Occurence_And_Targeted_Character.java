package Strings;

import java.util.Scanner;

public class Frequency_Of_Occurence_And_Targeted_Character {
	public static void main(String[] args) {
		String s="Hello world";
		frequencyIndexOf(s);
		System.out.println();
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]=='1')
				continue;  
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='1'; 
				}
			}
			System.out.print(arr[i]+" -> "+count+"   ");
		}
		System.out.println();
		targetedCharacterFrequency("targeted character count: "+s);
	}
	
	public static void targetedCharacterFrequency(String s) {
		System.out.println("Enter a charcter: ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++; 
			}
		}
		System.out.println(count);
	}
	
	public static void frequencyIndexOf(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			int count=0;
			if(str.indexOf(s.charAt(i))==-1 && s.charAt(i)!=' ') {
				for(int j=0;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
				}
				System.out.print(s.charAt(i)+" -> "+count+"   ");
			}
			str+=s.charAt(i); 
		}
	}
}

/*
 for(int i=0;i<arr.length;i++) {
			boolean visited=false;
			int count=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					visited=true;
					break;
				}
			}
			if(visited)
				continue;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			System.out.println(arr[i]+" -> "+count);
		}
 */