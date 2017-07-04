package com.sahaj.pricing;

import org.junit.Assert;
import org.junit.Test;

import static java.util.Collections.singletonList;

public class BillTest {
    @Test
    public void shouldComputeTotalPrice() {
        Bill bill = new Bill();

        double totalPrice = bill.totalPrice(new Order(
            singletonList(new Product("fogg", 2, 0.2, 100, ProductCategory.COSMETICS)),
            OrderType.ONLINE, PaymentType.CASH_ON_DELIVERY, true, new Customer("bond", 1007), Coupon.FLAT5
        ));

        Assert.assertEquals(237.875, totalPrice, 0.001);
    }
}
