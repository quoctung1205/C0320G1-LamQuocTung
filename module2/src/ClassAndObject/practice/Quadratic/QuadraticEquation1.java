package ClassAndObject.practice.Quadratic;

public class QuadraticEquation1 {
    private double a, b, c;

    QuadraticEquation1(){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
		return this.a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return this.b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return this.c;
	}

	public void setC(double c) {
		this.c = c;
	}
   
    public double getDiscriminant(){
        return  this.b*this.b - (4*this.a*this.c);
    }
    public double getRoot1(){
        return (-this.b+Math.sqrt(this.b*this.b - (4*this.a*this.c)))/2*this.a;
    }
    public double getRoot2(){
        return (this.b-Math.sqrt(this.b*this.b - (4*this.a*this.c)))/2*this.a;
    }
}