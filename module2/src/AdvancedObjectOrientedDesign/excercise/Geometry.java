package AdvancedObjectOrientedDesign.excercise;

import AdvancedObjectOrientedDesign.excercise.interfaceResizeable.Circle;
import AdvancedObjectOrientedDesign.excercise.interfaceResizeable.Rectangle;
import AdvancedObjectOrientedDesign.excercise.interfaceResizeable.Shape;
import AdvancedObjectOrientedDesign.excercise.interfaceResizeable.Square;
import AdvancedObjectOrientedDesign.practice.InterfaceColorable;

public class Geometry {
    public static void main(String[] args) {
        Shape[] geometries = new Shape[3];
        geometries[0] = new Circle(3.5);
        geometries[1] = new Rectangle(1.5,2.5);
        geometries[2] = new Square(2.5,"indigo",false);
        for(Shape shape : geometries){
            if(shape instanceof Square) {
                InterfaceColorable square = (Square)shape;
                square.howToColor();
            }
            System.out.println(shape);
        }
        
    }

}