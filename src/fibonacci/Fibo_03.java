package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 10.03.15.
 */
public class Fibo_03 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(fibonacci(number));

    }
    public static int fibonacci(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number -1) + fibonacci(number -2);
    }
}
