package inheritance.excesice.Circle_And_Cylinder;

public class Circle {
    private double radius = 2;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString(){
        return "A circle have a radius"
        + getRadius()
        +"And Area of radius"
        +getArea();
    }
}