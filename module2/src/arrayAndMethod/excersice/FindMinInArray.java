package arrayAndMethod.excersice;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number of element: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for(int i=0; i<size;i++){
            System.out.println("Input array[" + i + "]= ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = array[0];
        for(int j =0; j< array.length;j++){
            if(array[j] < min){
                min = array[j];
            }
        }
        System.out.println("Min is: " + min);
    }
}
