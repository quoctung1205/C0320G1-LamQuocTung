package ClassAndObject.excersice;

public class testCode1 {
    void method (int[] x){
        x[0] = 5;
        x[1] = 5;
    }
    public static void main(String[] args) {
        testCode1 test = new testCode1();
        int[] x = {1,1};
        test.method(x);
        System.out.printf("%d,%d",x[0],x[1]);
    }
}
