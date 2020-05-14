package keThua.baitap.cycleandcylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * Math.PI * 2;
    }

    @Override
    public String toString() {
        return "A Circle with Radius = " + getRadius() + " and color is " + getColor()
                + " has area " + getRadius() + " and Perimeter " + getPerimeter();
    }
}
