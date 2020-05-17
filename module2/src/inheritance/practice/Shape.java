package inheritance.practice;

public class Shape {
    private String color = "Green";
    private boolean fill = true;
    
    public Shape(){
    }

    public Shape(String color, boolean fill){
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFill() {
		return this.fill;
	}

    @Override
    public String toString(){
        return "A shape color of "
                +getColor()
                + " and "
                + (isFill() ? "fill" : "not fill");
    }
}
