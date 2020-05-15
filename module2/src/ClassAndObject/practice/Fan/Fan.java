package ClassAndObject.practice.Fan;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
		return this.radius;
	}

    public void setRadius(double radius) {
		this.radius= radius;
	}

    public String getColor() {
		return this.color;
	}

    public void setColor(String color) {
		this.color = color;
	}
    public void toString(boolean on){

    }
}