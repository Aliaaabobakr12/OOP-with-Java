/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 7
 */

public class Circle extends Point {
    private double radius;
    public Circle() {
       this(0, 0, 1);
    }
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
    public double circumference() {
        return 2 * 3.14 * radius;
    }
    @Override
    public void printPoint() {
        super.printPoint();
        System.out.println("Radius: " + radius);
    }
}