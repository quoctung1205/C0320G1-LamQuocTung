package inheritance.practice;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color, boolean fill){
        super(color,fill);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
		return this.width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(Double length) {
		this.length = length;
    }
    public double Area(){
        return width*length;
    }
    public double Perimeter(){
        return (width + length) *2;
    }


    @Override
    public String toString(){
        return "A Rectangle with width="
        + getWidth()
        + " and length="
        + getLength()
        + ", which is a subclass of "
        + super.toString();
    }
}