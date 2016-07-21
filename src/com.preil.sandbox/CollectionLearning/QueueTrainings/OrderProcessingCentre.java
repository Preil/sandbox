package com.preil.sandbox.CollectionLearning.QueueTrainings;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.preil.sandbox.CollectionLearning.QueueTrainings.Order.*;
import static com.preil.sandbox.CollectionLearning.QueueTrainings.Product.*;

/**
 * Ilya 20.07.2016.
 */
public class OrderProcessingCentre {
    private int orderNo = 0;
    private final Queue<Order> orders = new ArrayDeque<>();

    public void setOrders(Order order) {
        orders.offer(order);
        orderNo = orderNo + 1;
        order.setOrderNo(orderNo);
    }

    public void CheckAllOrders() {
        while (!orders.isEmpty()) {
            final Order order = orders.remove();
            System.out.println("Processing order No: " + order.getOrderNo() + "\n Products: " + order.products.toString()
                    + "\n Customer: " + order.getContacts());
            order.checked = true;
        }
        System.out.println("All products checked!");
    }

    public void placeOrder() {

    }

    public static void main(String[] args) {
        final OrderProcessingCentre orderCentrre = new OrderProcessingCentre();
        orderJack.products.add(radio);
        orderJills.products.add(fridge);
        orderMarry.products.add(radio);
        orderMarry.products.add(tvset);

        orderCentrre.setOrders(orderJack);
        orderCentrre.setOrders(orderJills);
        orderCentrre.setOrders(orderMarry);

        orderCentrre.CheckAllOrders();

    }


}
