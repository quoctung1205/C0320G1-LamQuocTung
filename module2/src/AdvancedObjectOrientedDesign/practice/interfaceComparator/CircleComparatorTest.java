package AdvancedObjectOrientedDesign.practice.interfaceComparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import inheritance.practice.Circle;


public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"indigo", false);
        System.out.println("Pre-sorted");
        for(Circle circle : circles){
            System.out.println(circle);
        }
        Comparator cirComparator = new CircleComparator();
        Arrays.sort(circles,cirComparator);

        System.out.println("After sort");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}