package edu.pingpong.Ricksy_bussiness;

import java.util.ArrayList;
import java.util.List;

public class Menus implements GuestDispatcher {
    private int stock = 100;
    private double menuCost = 10d;

    private final List<String> orders = new ArrayList<String>();

    Menus() {
    }

    int stock() {
        return this.stock;
    }

    double cost() {
        return this.menuCost;
    }

    public void dispatch(CreditCard card) {
        if (this.stock > 0 && card.pay(menuCost)) {
            this.stock--;
            this.orders.add(card.cardOwner());
        }
    }

    @Override
    public String toString() {
        return "stock: " + this.stock + "\n" + "cost: " + this.menuCost;
    }
}
