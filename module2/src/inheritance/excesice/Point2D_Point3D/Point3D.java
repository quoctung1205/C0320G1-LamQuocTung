package inheritance.excesice.Point2D_Point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(){
        this.z=z;
    }
    public void setXYZ(float x, float y, float z){
        this.z=z;
    }

    @Override
    public String toString(){
        return "Point3D is"
                +super.toString()
                +" "
                +getZ();
                
    }
}