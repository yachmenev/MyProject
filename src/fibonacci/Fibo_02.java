package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 10.03.15.
 */
public class Fibo_02 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        int number = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= number ; i++) {
            System.out.print(fibonacci(i) + " ");
        }


        }
    public static int fibonacci(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibo = 1;

        for (int i = 3; i <= number; i++) {
            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
        }
        return fibo;
    }
}
