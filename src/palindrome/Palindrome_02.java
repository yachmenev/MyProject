package palindrome;

public class Palindrome_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(istPalindrom("MataM"));
	}
	
	public static boolean istPalindrom(String str){
		char[] word = str.toCharArray();
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}

}
