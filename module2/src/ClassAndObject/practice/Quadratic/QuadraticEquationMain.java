package ClassAndObject.practice.Quadratic;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation1 quadra = new QuadraticEquation1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Input b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Input c");
        double c = Double.parseDouble(scanner.nextLine());
        quadra.setA(a);
        quadra.setB(b);
        quadra.setC(c);
        double delta = quadra.getDiscriminant();
        System.out.println(delta);
        System.out.println(quadra.getRoot1());
        System.out.println(quadra.getRoot2());
    }
}