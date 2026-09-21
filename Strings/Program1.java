package Strings;

public class Program1 {
	public static void main(String[] args) {
		String s="java";
		printAllElements(s);
		evenIndexCharacters(s);
		evenIndexAsciiValues(s);
		asciiValuesOfAllCharacters(s);
		evenCharactersUpperCaseOddLowerCase(s);
	}
	
	public static void printAllElements(String s) {
		System.out.print("All elements: ");
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+"  ");
		}
	}
	
	public static void evenIndexCharacters(String s) {
		System.out.print("\nEven index characters: ");
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.print(s.charAt(i)+"  ");
			}
		}
	}
	
	public static void evenIndexAsciiValues(String s) {
		System.out.print("\nEven Index ascii values: ");
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.print(s.charAt(i)+" = "+(int)s.charAt(i)+"  ");
			} 
		}
	}
	
	public static void asciiValuesOfAllCharacters(String s) {
		System.out.print("\nAscii values of all characters: ");
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" = "+(int)s.charAt(i)+"  ");
		}
	}
	
	public static void evenCharactersUpperCaseOddLowerCase(String s) {
		System.out.print("\nEven characters upper case and odd characters lower case: ");
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch%2==0) {
					ch=(char)(ch-32);					
				}
			} 	
			else if(ch>='A' && ch<='Z') {
				if(ch%2!=0) {
					ch=(char)(ch+32);
				}
			}  
			System.out.print(ch); 
		}
	}
}
