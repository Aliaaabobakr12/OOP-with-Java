/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 9
 */

/*
This program demonstrates OOP concepts, including class and object modeling, encapsulation, 
inheritance, polymorphism, association, composition, method overriding, constructor usage.
*/

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer premCust = new Customer("Aliaa");
        premCust.setMember(true);
        premCust.setMemberType("Premium");

        Customer goldCust = new Customer("Habiba");
        goldCust.setMember(true);
        goldCust.setMemberType("Gold");

        Customer silverCust = new Customer("Asmaa");
        silverCust.setMember(true);
        silverCust.setMemberType("Silver");

        Customer regularCustomer = new Customer("Ebrahim");

        Visit visit1 = new Visit(premCust, new Date());
        visit1.setServiceExpense(200);
        visit1.setProductExpense(100);

        Visit visit2 = new Visit(goldCust, new Date());
        visit2.setServiceExpense(100);
        visit2.setProductExpense(50);

        System.out.println("Bill for " + visit1.getName() + ": $" + visit1.getTotalExpense());
        System.out.println("Bill for " + visit2.getName() + ": $" + visit2.getTotalExpense());
    }
}
