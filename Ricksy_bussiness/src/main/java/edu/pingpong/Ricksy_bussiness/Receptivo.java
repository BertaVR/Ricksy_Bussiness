package edu.pingpong.Ricksy_bussiness;

import java.util.LinkedHashSet;
import java.util.Set;

public class Receptivo {
    Receptivo() {
    }

    private Set<GuestDispatcher> dispatchers = new LinkedHashSet<>();

    void registra(GuestDispatcher dispatcher) {
        dispatchers.add(dispatcher);
    }

    void dispatch(CreditCard card) {
        for (GuestDispatcher dispatcher : dispatchers) {
            dispatcher.dispatch(card);
        }
    }
}
