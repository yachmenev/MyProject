package palindrome;

public class Palindrome_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome("lassal"));

	}
	
	public static boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}

}
