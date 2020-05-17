package inheritance.practice;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square2 = new Square(2.3);
        System.out.println(square2);

        Square square3 = new Square(5.8,"yellow",true);
        System.out.println(square3);
    }
}