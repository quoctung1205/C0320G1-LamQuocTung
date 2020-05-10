package arrayAndMethod.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PassStudent {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input a size");
            size = Integer.parseInt(scanner.nextLine());
            if(size > 30){
                System.out.println("size does not exceed 30");
            }
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter a mark for student " + (i + 1) + " :");
            array[i]= Integer.parseInt(scanner.nextLine());
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int value : array) {
            System.out.println(value + "\t");
            if (value >= 5 && value <= 10) {
                count++;
            }
        }
        System.out.println("Student pass is: "+ count);
    }
}
