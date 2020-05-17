package inheritance.excesice.Point_MoveablePoint;

public class MoveablePoint extends Point {
    private float speedX = 0.0f;
    private float speedY = 0.0f;
    public MoveablePoint(){
    }
    public MoveablePoint(float x, float y, float speedX,float speedY){
        super(x,y);
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public float getSpeedX() {
		return this.speedX;
	}

	public void setSpeedX(Float speedX) {
		this.speedX = speedX;
	}

	public float getSpeedY() {
		return this.speedY;
	}

	public void setSpeedY(Float speedY) {
        this.speedY = speedY;
    }
    public void setSpeed(float speedX,float speedY){
        this.speedX = speedX;
        this.speedY = speedY;
    }


    @Override
    public String toString(){
        return "Moveable Point is"
                +getSpeedX()
                +" "
                +getSpeedY()
                +" and "
                +super.toString();
    }
}