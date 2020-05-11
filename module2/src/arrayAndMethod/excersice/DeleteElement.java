package arrayAndMethod.excersice;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number of Element");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Input array[" + i + "]");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int count =0;
        System.out.println("Input X is Element to delete");
        int x = Integer.parseInt(scanner.nextLine());
        for(int j = 0; j< array.length;j++){
            if(array[j] != x){
                array[count] = array[j];
                count++;
            }
        }
        size = count;
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}
