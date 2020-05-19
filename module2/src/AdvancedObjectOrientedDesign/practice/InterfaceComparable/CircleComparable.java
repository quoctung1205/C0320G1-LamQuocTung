package AdvancedObjectOrientedDesign.practice.InterfaceComparable;

import AdvancedObjectOrientedDesign.practice.interfaceComparator.CircleComparator;
import inheritance.practice.Circle;

public class CircleComparable extends Circle implements Comparable<CircleComparable>{
    public CircleComparable(){
    }

    public CircleComparable(double radius){
        super(radius);
    }

    public CircleComparable(double radius, String color, boolean fill){
        super(radius, color, fill);
    }

    @Override
    public int compareTo(CircleComparable o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }else if (getRadius() < o.getRadius()){
            return -1;
        }else return 1;
    }
    
}