package examples;

/**
 * Created by Admin on 11.03.15.
 */
public class MyTimer {
    public static void main(String[] args) throws InterruptedException {
        //A nanosecond (ns) is an SI unit of time equal to one billionth of a second
        //10−9 с
        long startTime = System.nanoTime();
        //A millisecond (ms) is a thousandth of a second. 1000 milliseconds — one second
        //10−3 с
        long startTime2 = System.currentTimeMillis();

        Thread.sleep(3000);
        long elapsedTime = System.nanoTime() - startTime;
        long elapsedTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Time in nanoseconds: \t" + elapsedTime + "ns\t-> " + (int)(elapsedTime * Math.pow(10, -9)) + "sec");
        System.out.println("Time in milliseconds: \t" + elapsedTime2 + "ms\t\t\t-> " + (int)(elapsedTime2 * Math.pow(10, -3)) + "sec");
    }
}
