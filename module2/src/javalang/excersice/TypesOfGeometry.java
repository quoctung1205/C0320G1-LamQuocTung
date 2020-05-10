package javalang.excersice;

import java.util.Scanner;

public class TypesOfGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Print the rectangle");
        System.out.println("Print the Square triangle");
        System.out.println("Print Isosceles triangle");
        System.out.println("Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                printRectangle();
                break;
            case 2:
                printSquareTriangle();
                break;
            case 3:
                printIsoscelesTriangle();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("No option have been selected");
        }
    }
    public static void printRectangle(){
        for(int i = 0; i< 7; i++){
            for (int j=0; j< 5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void printSquareTriangle(){
        String j = "* ";
        String a = "";
        for(int i = 1; i <=6;i++){
            a = a + j;
            System.out.println(a);
        }
    }
    public static void printIsoscelesTriangle(){
        int num = 6;
        for (int i = 1; i <= num; i++){
            for(int j = 1;j <= num - i; j++){
                System.out.print("");
            }
            for (int j =1;j <= 2*i ; j++){
                System.out.println("*");
            }
        }
    }
}
