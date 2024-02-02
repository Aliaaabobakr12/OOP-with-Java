/*
 * Aliaa Abobakr Elshiekh
 * 120210151
 * CSE 3
 * Assignment 7
 */

/* 
This Program demonstrates OOP concepts including class and object creation, inheritance, 
abstraction with virtual methods, polymorphism through method overriding, encapsulation 
with protected data members, and constructor usage for initializing base and derived classes.
*/

public class Main {
    public static void main(String[] args) {
        Freshman freshman = new Freshman(120210155, "Asmaa Abobakr", 18, "Burg Alarab", "01155653256");
        Junior junior = new Junior(120210151, "Aliaa Abobakr", 20, "Burg Alarab", "01223873106");
        Senior senior = new Senior(120210166, "Habiba Mamdouh", 22, "Kafr Elshiekh", "01023389321");

        System.out.println("Freshman:");
        freshman.print();

        System.out.println("\nJunior:");
        junior.print();

        System.out.println("\nSenior:");
        senior.print();
    }
}
