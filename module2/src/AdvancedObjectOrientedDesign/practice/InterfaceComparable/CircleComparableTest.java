package AdvancedObjectOrientedDesign.practice.InterfaceComparable;

import java.util.Arrays;

public class CircleComparableTest {
    public static void main(String[] args) {
        CircleComparable[] circleComparable = new CircleComparable[3];
        circleComparable[0]= new CircleComparable(3.6);
        circleComparable[1]= new CircleComparable();
        circleComparable[2]=new CircleComparable(3.5,"indigo",false);

        System.out.println("pre-sorted: ");
        for(CircleComparable circleComparable2 : circleComparable){
            System.out.println(circleComparable);
        }

        Arrays.sort(circleComparable);
        System.out.println("After resorted: ");
        for(CircleComparable circleComparable2 : circleComparable){
            System.out.println(circleComparable2);
        }
    }
}