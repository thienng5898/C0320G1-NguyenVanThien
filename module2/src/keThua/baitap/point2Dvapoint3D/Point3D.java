package keThua.baitap.point2Dvapoint3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public void setXYZ(float z, float x, float y) {
        super.setXY(x,y);
        setZ(z);
    }

    public float[] getXYZ() {
       return new float[] {getX(),getY(),getZ()} ;
    }

    @Override
    public String toString() {
        return "Point3D{ x= " + getX() +
                ", y=" + getY() +
                " z= " + z +
                '}';
    }
}
