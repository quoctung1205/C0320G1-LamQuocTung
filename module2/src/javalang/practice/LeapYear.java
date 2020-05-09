package javalang.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year",year);
                }else {
                    System.out.printf("%d is not a leap year",year);
                }
            } else {
                System.out.printf("%d is a leap year",year);
            }
        }else {
            System.out.printf("%d is not a leap year",year);
        }
    }
}
