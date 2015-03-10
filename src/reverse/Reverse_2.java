package reverse;

/**
 * Created by Admin on 10.03.15.
 */
public class Reverse_2 {
    public static void main(String[] args) {
        System.out.println("Input: 4567, Reverse: " + reverse(4567));
    }
    public static Number reverse(int number){
        return Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}
