package palindrome;

public class Palindrome_number {
    public static void main(String[] args) {

        System.out.println(myFunction(222, 333));
    }

    public static int myFunction(int x, int y){
        int z = x * y;
        while (z-- > 0){
            if (isPalindrome(String.valueOf(z))){
                break;
            }
        }
        return z;
    }
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuffer(str).reverse().toString());
    }
}
