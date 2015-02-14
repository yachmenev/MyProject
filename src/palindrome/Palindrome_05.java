package palindrome;

public class Palindrome_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(isPal("baddab"));
	}
	
	public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return isPal(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }

}
