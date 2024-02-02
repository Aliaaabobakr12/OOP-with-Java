/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 7
 */

// Inheritance in OOP

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 5);
        point.printPoint();

        Circle circle = new Circle(7, 11, 3);
        circle.printPoint();
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());

        Cylinder cylinder = new Cylinder(3, 5, 3, 5);
        cylinder.printPoint();
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.surfaceArea());
    }
}
