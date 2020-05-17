package inheritance.excesice.Point2D_Point3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
		return this.x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return this.y;
	}

	public void setY(Float y) {
		this.y = y;
	}
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Point2D is"
                +getX()
                +" "
                +getY();
    }
}