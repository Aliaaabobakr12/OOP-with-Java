/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 7
 */

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        this(0, 0, 1, 1);
    }
    public Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double volume() {
        return area() * height;
    }
    public double surfaceArea() {
        return (2 * area()) + (circumference() * height);
    }
    @Override
    public void printPoint() {
        super.printPoint();
        System.out.println("Height: " + height);
    }
}