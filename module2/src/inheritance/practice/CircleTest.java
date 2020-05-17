package inheritance.practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        Circle circle3 = new Circle(3.5,"indigo",false);
        System.out.println(circle3);
    }
}