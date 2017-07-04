package com.sahaj.pricing;

import java.util.List;

public class Order {
    private List<Product> products;
    private OrderType orderType;
    private PaymentType paymentType;
    private boolean gift;
    private Customer customer;
    private Coupon coupon;

    public Order(List<Product> products, OrderType orderType, PaymentType paymentType, boolean gift, Customer customer, Coupon coupon) {
        this.products = products;
        this.orderType = orderType;
        this.paymentType = paymentType;
        this.gift = gift;
        this.customer = customer;
        this.coupon = coupon;
    }
}
