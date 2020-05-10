package arrayAndMethod.practice;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter Element " +(i+1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println("Property list: ");
        for (int value : array) {
            System.out.println(value + "\t");
        }
        int max = array[0];
        int index = i;
        for(int j = 0; j < array.length;j++){
            if(array[j] > max){
                max = array[i];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is: " + max + " ,at position "+ index);
 }
}
