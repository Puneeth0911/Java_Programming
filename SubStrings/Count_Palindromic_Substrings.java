package SubStrings;

public class Count_Palindromic_Substrings {
	public static void main(String[] args) {
		String s="aaa";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i,j);
				String rev="";
				for(int k=sub.length()-1;k>=0;k--) 
					rev+=sub.charAt(k);
				if(sub.equals(rev))
					count++;
			}
		}
		System.out.println(count);
	}
}
