package arrayAndMethod.excersice;

import java.util.Scanner;

public class CountNumberOccurence {
    public static void main(String[] args) {
        String[] array = {"a","v","1","9","z","r","r","r"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a element");
        String element = scanner.nextLine();
        int count = 0;
        for (int i =0; i< array.length;i++){
            if(array[i].equals(element)){
                count++;
            }
        }
        System.out.println("the number of occurrences is: " + count);
    }
}
