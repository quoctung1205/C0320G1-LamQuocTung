package arrayAndMethod.excersice;

import java.util.Scanner;

public class TwoDimentional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of Lines: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a number of Column: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[n][m];
        for(int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println("Input array[" + i + "]" + "[" + j +"]");
                array[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += array[i][i];
        }
        System.out.println("Sum is: " + sum);
    }
}
