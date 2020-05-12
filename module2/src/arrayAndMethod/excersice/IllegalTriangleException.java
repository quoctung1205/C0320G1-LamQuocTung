package arrayAndMethod.excersice;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a edge 1 of triangle");
        int edge = Integer.parseInt(scanner.nextLine());
        System.out.println("input a edge 2 of triangle");
        int edge2 = Integer.parseInt(scanner.nextLine());
        System.out.println("input a edge 3 of triangle");
        int edge3 = Integer.parseInt(scanner.nextLine());
        if(edge <= 0 && edge2 <= 0 && edge3 <= 0){

        }
    }
}