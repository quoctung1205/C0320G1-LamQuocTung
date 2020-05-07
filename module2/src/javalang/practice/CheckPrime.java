package javalang.practice;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if(number<2) System.out.println(number + " is not prime");
        else {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number + " is prime");
            else System.out.println(number + " is not prime");
        }
    }
}
