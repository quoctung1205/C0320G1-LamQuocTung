package arrayAndMethod.excersice;

import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] array = new Integer[100];
        System.out.println("List of element array");
        for(int i= 0; i< 100;i++){
            array[i] = rd.nextInt(100);
            System.out.println(array[i] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayExample = new ArrayIndexOutOfBoundsException();
        Integer[] array = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input index of element");
        int x = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Giá trị phần tử chỉ có số 5 " + x + " là: " + array[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt qua giới hạn của mảng");
        }
    }
}