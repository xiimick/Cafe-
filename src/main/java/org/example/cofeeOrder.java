package org.example;

import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class cofeeOrder {
    private static final Logger logger = LoggerFactory.getLogger(cofeeOrder.class);
    private List<order> orders;
    private int nextOrderNumber;

    public cofeeOrder() {
        orders = new LinkedList<>();
        nextOrderNumber = 1;
    }

    public void add(String customerName) {
        order newOrder = new order(nextOrderNumber++, customerName);
        orders.add(newOrder);
        logger.info("New order added: {}", newOrder);
    }

    public order deliver() {
        if (orders.isEmpty()) {
            logger.warn("No orders to deliver");
            return null;
        }
        order nextOrder = orders.remove(0);
        logger.info("Delivered order: {}", nextOrder);
        return nextOrder;
    }

    public order deliver(int orderNumber) {
        for (order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.remove(order);
                logger.info("Delivered specific order: {}", order);
                return order;
            }
        }
        logger.warn("Order with number {} not found", orderNumber);
        return null;
    }

    public void draw() {
        logger.info("Current queue:");
        System.out.println("Num | Name");
        for (order order : orders) {
            System.out.println(order);
        }
    }
}
