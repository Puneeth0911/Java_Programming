package Strings;

public class Reverse_Word_without_inbuilt_method {
	public static void main(String[] args) {
		String s="Hi to everyone";
		String str="";
		System.out.print("Reverse word: ");
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				str=s.charAt(i)+str;
			}
			else {
				System.out.print(str+" ");
				str="";
			}
		}
		System.out.println(str);
		System.out.println("-----------------------");
		reverseWordInSamePosition(s);
	}  
	public static void reverseWordInSamePosition(String s) {
		System.out.print("Reverse word in same position: ");
		String str="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				str=s.charAt(i)+str;
			}
			else {
				System.out.print(str+" ");
				str="";
			}
		}
		System.out.println(str);
	}
}
