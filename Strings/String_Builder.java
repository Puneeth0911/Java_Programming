package Strings;

public class String_Builder {
	public static void main(String[] args) {
		String s="bye";
		StringBuilder sbuild=new StringBuilder(); 
		sbuild.append("helloworld");
		System.out.println(sbuild.capacity()); //16

		StringBuilder sbuild1=new StringBuilder("hello"); 
		System.out.println(sbuild1.capacity()); //21

		System.out.println(sbuild.reverse()); //olleh
		
		System.out.println(sbuild.repeat(sbuild, 2)); //olleholleholleh
		s=s.repeat(2);
		System.out.println(s); //byebye
		
		System.out.println(sbuild1.deleteCharAt(0)); //ello
		
		sbuild1.setCharAt(3, 'Z');
		System.out.println(sbuild1); //ellZ
	}
}
