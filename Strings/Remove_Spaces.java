package Strings;

public class Remove_Spaces {
	public static void main(String[] args) {
		String str="Java Programming subject";
		String res="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				res+=str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
