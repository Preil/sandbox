package com.preil.sandbox.CollectionLearning.QueueTrainings;

import com.preil.sandbox.CollectionLearning.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Ilya 20.07.2016.
 */
public class Order {

    public static Order orderJills = new Order(Customer.Jill);
    public static Order orderJack = new Order(Customer.Jack);
    public static Order orderMarry = new Order(Customer.Marry);

    private int OrderNo;
    private final Customer customer;
    public List<Product> products = new ArrayList<>();
    public boolean checked;
    public boolean placed;

    public Order(Customer customer) {
        this.customer = customer;
        checked = false;
        placed = false;
    }
    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int orderNo) {
        OrderNo = orderNo;
    }
    public String getContacts() {
        return customer.getContacts();
    }
}
