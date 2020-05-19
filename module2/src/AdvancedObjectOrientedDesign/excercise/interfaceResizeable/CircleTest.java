package AdvancedObjectOrientedDesign.excercise.interfaceResizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.resize(Math.floor(Math.random()*101));
        // System.out.println(circle);

        // circle = new Circle(3.5);
        // System.out.println(circle);

        // circle = new Circle(3.5, "indigo", false);
        // System.out.println(circle);
    }
}
