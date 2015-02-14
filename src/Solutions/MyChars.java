package Solutions;

import java.util.Random;

/**
 * Created by Admin on 30.09.14.
 */
public class MyChars {
    public static void main(String[] args) {
        char [] aChar = new char[15];

        Random random = new Random();
        System.out.println ("Created array: ");
        for(int i = 0; i < aChar.length; i ++){
            aChar[i] = (char) (random.nextInt(100));

            }
        for (char ch : aChar){
            System.out.print(ch + " ");
        }

    }

}
