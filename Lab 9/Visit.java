/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 9
 */

import java.util.Date;

class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense, productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = 0;
        this.productExpense = 0;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double expense) {
        this.serviceExpense = expense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double expense) {
        this.productExpense = expense;
    }

    public double getTotalExpense() {
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate(customer.getMemberType());

        double totalServiceCost = serviceExpense * (1 - serviceDiscount);
        double totalProductCost = productExpense * (1 - productDiscount);

        return totalServiceCost + totalProductCost;
    }

    @Override
    public String toString() {
        return "Visit" + "\n" +
                "Customer: " + customer + "\n" +
                "Date: " + date + "\n" +
                "Service Expense: " + serviceExpense + "\n" +
                "Product Expense: " + productExpense;
    }
}