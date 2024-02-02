/*
 * Aliaa Abobakr Elshiekh
 * 120210151
 * CSE 3
 * Assignment 7
 */

class Senior extends Student {
    public Senior(int id, String name, int age, String address, String phoneNumber) {
        super(id, name, age, address, phoneNumber);
    }

    @Override
    public double getFees() {
        return 300 + (0.2 * 300);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Fees: " + getFees());
    }
}