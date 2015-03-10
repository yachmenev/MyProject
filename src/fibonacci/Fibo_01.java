package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 10.03.15.
 */
public class Fibo_01 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        int number = Integer.parseInt(reader.readLine());

        int arr[] = new int[8];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < 8; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
