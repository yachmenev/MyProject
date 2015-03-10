package reverse;

/**
 * Created by Admin on 10.03.15.
 */
public class Reverse_number {
    public static void main(String[] args) {
        System.out.println("Input: 567, Reverse: " + reverse(567));

    }
    public static Number reverse(int number){
        int reverse = 0;

        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        return reverse;
    }
}
