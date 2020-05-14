package keThua.baitap.cycleandcylinder;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public double getArea() {
        return 2 * Math.PI * this.getRadius() * this.height + 2 * Math.PI * this.getRadius() *this.getRadius();
    }

    public double getVolume() {
        return this.getRadius()* this.getRadius() * Math.PI * height;
    }
    @Override
    public String toString() {
        return "Cylinder with height " + getHeight() +" and radius " + getRadius() +" and color "+ getColor()
                + " has Area= " + getArea() + " and Volume =" + getVolume()
                + ", which is a subclass of "
                + super.toString() ;
    }
}
