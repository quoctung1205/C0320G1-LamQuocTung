package inheritance.practice;

import javax.sound.sampled.SourceDataLine;

public class RectangleTest{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);


        Rectangle rectangle2 = new Rectangle(10,15);
        System.out.println(rectangle2);


        Rectangle rectangle3 = new Rectangle(10,15,"Red",false);
        System.out.println(rectangle3);
    }
}