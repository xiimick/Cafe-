package org.example;

public class order {
    private int orderNumber;
    private String customerName;

    public order(int orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return orderNumber + " | " + customerName;
    }
}
