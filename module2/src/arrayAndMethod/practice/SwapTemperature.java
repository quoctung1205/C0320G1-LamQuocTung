package arrayAndMethod.practice;

import java.util.Scanner;

public class SwapTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("0.Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                fahrenheit();
                break;
            case 2:
                celsious();
                break;
            case 0:
                System.exit(0);
        }
    }

    public static void fahrenheit() {
        System.out.println("Input Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        int fahrenheitInput = Integer.parseInt(scanner.nextLine());
        double Celsius = (5.0 / 9) * (fahrenheitInput - 32);
        System.out.println(Celsius + " Celsius");
    }

    public static void celsious() {
        System.out.println("Input Celsius: ");
        Scanner scanner = new Scanner(System.in);
        int CelsiusInput = Integer.parseInt(scanner.nextLine());
        double fahrenheit = (9.0 / 5 ) * CelsiusInput + 32;
        System.out.println(fahrenheit + " Fahrenheit");
    }
}
