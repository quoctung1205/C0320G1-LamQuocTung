package inheritance.excesice.Circle_And_Cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(Double height,Double radius) {
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    } 
    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString(){
        return "The volume of Cylinder is"
                + getVolume()
                +super.toString();
    }
}