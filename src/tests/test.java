package tests;

/**
 * Created by Admin on 16.10.14.
 */
public class test {
    public static void main(String... args) {
        test("aaa", "a");
    }
    public static void test(String... str){
        System.out.println("A");
    }
    public static void test(String str1, String str2){
        System.out.println("B");

    }public static void test(String str1, String... str2){
        System.out.println("C");
    }
}
