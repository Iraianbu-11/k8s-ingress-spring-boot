package org.iraianbu.order.service;

import org.iraianbu.order.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final List<Order> orderList = List.of(
            new Order(1, 101, "Pending", 1699.98),
            new Order(2, 102, "Shipped", 199.99),
            new Order(3, 103, "Delivered", 999.99)
    );

    public List<Order> getAllOrders(){
        return orderList;
    }
}
