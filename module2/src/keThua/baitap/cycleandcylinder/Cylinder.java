package keThua.baitap.cycleandcylinder;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea() {
        return 2 * Math.PI * super.getRadius() * this.height + 2 * Math.PI * super.getRadius() * super.getRadius();
    }

    public double getVolume() {
        return super.getRadius() * super.getRadius() * Math.PI * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder with height " + getHeight() + " and radius " + super.getRadius() + " and color " +
                super.getColor()
                + " has Area= " + getArea() + " and Volume =" + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }
}
