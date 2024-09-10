package org.iraianbu.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int orderId;
    private int customerId;
    private String status;
    private double totalAmount;
}
