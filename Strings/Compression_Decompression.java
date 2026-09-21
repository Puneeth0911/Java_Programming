package Strings;

public class Compression_Decompression {
	public static void main(String[] args) {
		String s1="AAABBC";
		String s2="A3B2C1";             
		System.out.println(compression(s1));
		System.out.println("--------");
		System.out.println(deCompression(s2));
	}
	public static String compression(String s1) {
		String st="";
		int count=1;
		for(int i=0;i<s1.length();i++) {
			if(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)) {
				count++;
			} else {
				st+=s1.charAt(i)+""+count;
				count=1;
			}
		}
		return st;
	}
	public static String deCompression(String s2) {
		StringBuilder sbuild=new StringBuilder();
		for(int i=0;i<s2.length();i+=2) {
			int count=s2.charAt(i+1)-'0';
//			int count=s2.charAt(i+1)-48;
			sbuild=sbuild.repeat(s2.charAt(i), count);
		}
		return sbuild.toString();
	}
}
