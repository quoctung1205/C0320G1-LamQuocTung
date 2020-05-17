package inheritance.practice;

public class Square extends Rectangle{
    public Square(){

    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side,String Color, boolean fill){
        super(side,side,Color,fill);
    }

    public double getSide(){
        return getWidth();
    }

    public double setSide(double side){
        setWidth(side);
        setLength(side);
        return side;
    }

   

    @Override
    public String toString(){
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}