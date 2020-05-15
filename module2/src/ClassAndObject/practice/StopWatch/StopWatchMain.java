package ClassAndObject.practice.StopWatch;

import java.util.Arrays;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch stop = new StopWatch();
        stop.start();
        int[] array = new int[100000];
        for(int i =0 ; i<array.length;i++){
            array[i] = (int) Math.random()*100000;
            Arrays.sort(array);
        }
        stop.end();
        System.out.println(stop.getElapsedTime());
    }
}