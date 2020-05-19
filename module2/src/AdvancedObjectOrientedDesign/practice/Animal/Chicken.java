package AdvancedObjectOrientedDesign.practice.Animal;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
        return "Chicken:cluck-cluck";
    }

    @Override
    public String howToEat() {
        // TODO Auto-generated method stub
        return "could be fried";
    }
    
}