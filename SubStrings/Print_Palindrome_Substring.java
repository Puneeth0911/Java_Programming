package SubStrings;

public class Print_Palindrome_Substring {
	public static void main(String[] args) {
		String s="madam";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i,j);
				String rev="";
				for(int k=sub.length()-1;k>=0;k--) 
					rev+=sub.charAt(k);
				if(sub.equals(rev))
					System.out.println(sub);
			}
		}
	}
}

/*
    public static void main(String[] args) {
        String s = "abba";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String temp = s.substring(i, j + 1);
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
*/