package javalang.practice;

import java.util.Scanner;

public class DesignMemeForApp {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1.draw the triangle");
            System.out.println("2.draw the square");
            System.out.println("3.draw the rectangle");
            System.out.println("0.exit");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println(".........");
                System.out.println("........");
                System.out.println(".......");
                System.out.println("......");
                System.out.println(".....");
                System.out.println("....");
                System.out.println("...");
                System.out.println("..");
                System.out.println(".");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}
