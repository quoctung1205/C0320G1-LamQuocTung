package javalang.practice;

import java.util.Scanner;

public class InterestLoans {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Money");
        money = Double.parseDouble(input.nextLine());
        System.out.println("Input Month");
        month = Integer.parseInt(input.nextLine());
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = Double.parseDouble(input.nextLine());
        double total_interest = 0;
        for (int i =0; i< month;i++){
            total_interest = money * (interset_rate/100)/12*3;
        }
        System.out.println("Total of interest: " + total_interest);
    }
}
