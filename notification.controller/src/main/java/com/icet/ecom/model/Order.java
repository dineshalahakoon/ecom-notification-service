package com.icet.ecom.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Order {
    private double price;
    private double taxValue;
    List<OrderItems> orderItems;

}
