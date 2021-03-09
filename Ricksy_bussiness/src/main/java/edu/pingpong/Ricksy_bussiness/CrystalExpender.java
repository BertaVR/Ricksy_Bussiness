package edu.pingpong.Ricksy_bussiness;

public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 0d;

    CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    int stock() {
        return this.stock;
    }

    double cost() {
        return this.itemCost;
    }

    public void dispatch(CreditCard card) {
        if (this.stock > 0 && card.pay(itemCost)) {
            this.stock--;
        }
    }

    @Override
    public String toString() {
        return "stock: " + this.stock + "\n" + "cost: " + this.itemCost;
    }
}
