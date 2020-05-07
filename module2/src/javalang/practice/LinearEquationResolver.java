package javalang.practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a question as 'a * x + b =0',please enter constant: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextFloat();
        System.out.println("b: ");
        double b = scanner.nextFloat();
        System.out.println("c: ");
        double c = scanner.nextFloat();
        if(a!=0){
            double solution = -b / a;
            System.out.println("The solution is: " + solution);
        }
        if(a==0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = %f!\n" + answer);
        }else {
            if (b == 0) {
                System.out.println("The resolution is all x");
            } else {
                System.out.println("No resolution");
            }
        }
    }
}
