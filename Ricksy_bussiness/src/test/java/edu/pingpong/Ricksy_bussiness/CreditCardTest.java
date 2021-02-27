package edu.pingpong.Ricksy_bussiness;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CreditCardTest {
    CreditCard creditCard = new CreditCard("Abrahadolf", "555");
    private double credit = 3000d;

    @Test
    public void chargeDiscountTest() {
        assertEquals(true, creditCard.pay(30));
        assertEquals(2970, creditCard.credit(), 0);

    }

    @Test
    public void falseChargeDiscountTest() {
        assertEquals(false, creditCard.pay(30000));
        assertEquals(3000, creditCard.credit(), 0);

    }

}
