package palindrome;

public class Palindrome_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "qwerrewq", reverse = "";
		int length = str.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + str.charAt(i);
	 
	      if (str.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	}

}
