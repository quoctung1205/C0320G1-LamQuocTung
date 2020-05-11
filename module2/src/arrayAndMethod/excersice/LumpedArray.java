package arrayAndMethod.excersice;

import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[4];
        for(int i=0; i < array1.length; i++){
            System.out.println("array1[" + i + "]");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int j=0; j< array2.length;j++){
            System.out.println("array2[" + j + "]");
            array2[j] = Integer.parseInt(scanner.nextLine());
        }
        int[] array3 = new int[array1.length + array2.length];
        for(int x = 0; x <array1.length;x++){
            for (int y : array2) {
                array3[x] = array1[x];
                array3[array2.length - 1] = y;
            }
        }
        for(int i =0; i< array3.length;i++){
            System.out.println(array3[i]);
        }
    }
}
