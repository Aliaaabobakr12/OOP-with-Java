/*
Aliaa Abobaakr Elshiekh
120210151
CSE 3
*/

// This sheet is intro to object oriented programming in java.

/*
Q1:

public class Secret {
    private String name;
    private int age, weight;
    private double height;
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
}

*/

/*
--------------------------------------------------------
Q2:

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation eq1 = new QuadraticEquation(a, b, c);
        double discriminant = eq1.getDiscriminant();

        if (discriminant > 0) {
            double root1 = eq1.getRoot1();
            double root2 = eq1.getRoot2();
            System.out.println("r1 = " + root1 + ", r2 = " + root2);
        } else if (discriminant == 0) {
            double root1 = eq1.getRoot1();
            System.out.println("The root is " + root1);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

*/
/*
--------------------------------------------------------
Q3:

import java.util.Scanner;

public class Square {
    private double side;
    private String color;

    public Square() {
        this.side = 1.0;
        this.color = "black";
    }
    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public static void main(String[] args) {
        Square s1 = new Square(10, "red");
        System.out.println(s1.side);
        System.out.println(s1.color);
    }
}

public class Main {
    static int min(int[] nums, int n) {
        int minNum = nums[0];
        for (int i =0;i<nums.length;i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        return minNum;
    }
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        int nums[]=new int[size];
        for (int i = 0; i < size; i++) {

           nums[i] = scanner.nextInt();
        }
        System.out.println(min(nums, size));
    }
}


*/

/*
-----------------------------------------------------
Q4:

public class Empolyee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    public Empolyee(String name) {
        this.name = name;
    }
    public void empAge(int age) {
        this.age = age;
    }
    public void empDesignation(String designation) {
        this.designation = designation;
    }
    public void empSalary(double salary) {
        this.salary = salary;
    }
    public void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
    public static void main(String[] args) {
        Empolyee empolyee1 = new Empolyee("Aliaa");
        empolyee1.empAge(20);
        empolyee1.empDesignation("Engineer");
        empolyee1.empSalary(70000);
        empolyee1.printEmployee();
    }
}

*/