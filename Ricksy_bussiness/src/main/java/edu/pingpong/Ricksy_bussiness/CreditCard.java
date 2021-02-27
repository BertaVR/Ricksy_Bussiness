package edu.pingpong.Ricksy_bussiness;

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit = 3000d;
    private final String SYMBOL = "EZI";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    String cardOwner() {
        return owner;
    }

    String number() {
        return number;
    }

    double credit() {
        return credit;
    }

    boolean pay(double charge) {
        if (this.credit >= charge) {
            this.credit -= charge;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "owner: " + this.owner + '\n' + "number: " + this.number + '\n' + "credit: " + this.credit + this.SYMBOL;
    }
}
