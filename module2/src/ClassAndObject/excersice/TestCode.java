package ClassAndObject.excersice;

public class TestCode {
    public static void main(String[] args) {
        TestCode circle1 = new TestCode();
        System.out.println("The area of circle is "+ circle1.radius + " is " + circle1.getArea());
        TestCode circle2 = new TestCode(25);
        System.out.println("The area of circle is " + circle2.radius + " is " + circle2.getArea());
        TestCode circle3 = new TestCode(125);
        System.out.println("The area of circle is " + circle3.radius + " is " + circle3.getArea());
        circle2.radius = 100;
        System.out.println("The area of circle is " + circle2.radius + " is " + circle2.getArea());
    }
    double radius;
    TestCode(){
        this.radius = 1;
    }
    TestCode(double newRadius){
        this.radius = newRadius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
