package edu.pingpong.Ricksy_bussiness;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    private double fee = 500d;
    private final Map<String, String> flota = new HashMap<String, String>();

    UfosPark() {
    };

    void add(String ovni) {
        flota.putIfAbsent(ovni, null);
    }

    @Override
    public void dispatch(CreditCard creditCard){
        flota.entrySet().stream()
        .filter(o -> o.getValue() == null).forAny(o -> o.replace(o.getKey(), creditCard));
    }


}
