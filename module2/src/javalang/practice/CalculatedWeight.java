package javalang.practice;

import java.util.Scanner;

public class CalculatedWeight {
    public static void main(String[] args) {
        double weight,height,BMI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Weight");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Input Height");
        height = Double.parseDouble(scanner.nextLine());
        BMI = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","BMI","Interpretation\n");
        if(BMI <18){
            System.out.printf("%-20.2f%s",BMI,"Underweight");
        }else if (BMI < 20.0){
            System.out.printf("%-20.2f%s",BMI,"Normal");
        }else if(BMI < 30.0){
            System.out.printf("%-20.2f%s",BMI,"Overweight");
        }else System.out.printf("%-20.2f%s",BMI,"Obese");
    }
}
