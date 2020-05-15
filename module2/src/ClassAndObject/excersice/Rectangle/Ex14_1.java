package ClassAndObject.excersice.Rectangle;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}