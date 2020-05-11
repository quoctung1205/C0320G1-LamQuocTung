package arrayAndMethod.excersice;

import java.util.Scanner;

public class MaxInTwoDimentionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of Lines");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a number of Columns");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[n][m];
        System.out.println("Input element in array");
        for (int i =0; i<n;i++){
            for (int j =0;j<m;j++){
                System.out.println("A[" + i + "]" + "[" + j + "]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = array[0][0];
        for (int i =0; i<m;i++){
            for (int j =0; j< n;j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
