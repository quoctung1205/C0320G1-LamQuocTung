package javalang.practice;

import java.util.Scanner;

public class DateOnMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count day: ");
        int month = scanner.nextInt();
        String daysInMonth = "";
        switch (month){
            case 2:
                System.out.println("The month '2' has 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "Invalid";
        }
        if (!daysInMonth.equals("Invalid"))
            System.out.printf("This month '%d' has %s days! ", month, daysInMonth);
        else System.out.println("Invalid input!");
    }
}
