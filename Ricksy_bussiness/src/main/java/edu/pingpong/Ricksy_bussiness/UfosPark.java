package edu.pingpong.Ricksy_bussiness;

import java.util.*;
import java.util.stream.Collectors;

public class UfosPark implements GuestDispatcher {
    private final Map<String, String> flota = new HashMap<String, String>();
    private final double fee = 500d;

    UfosPark() {
    }

    void add(String ovni) {
        flota.putIfAbsent(ovni, null);
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        if (!flota.containsValue(creditCard.number())) {
            List<String> idList = flota.entrySet().stream()
                    .filter(o -> o.getValue() == null).map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            if (!idList.isEmpty() && creditCard.pay(fee)) {
                this.flota.put(idList.get(0), creditCard.number());
            }
        }
    } //yo creo que esto lo podemos refactorizar

    String getUfoOf(String cardNumber) {
        String ufoID = null;
        if (this.flota.containsValue(cardNumber)) {
            List<String> ufoOfList = flota.entrySet().stream()
                    .filter(o -> o.getValue() == cardNumber).map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            ufoID = (this.flota.isEmpty()) ? null : ufoOfList.get(0);

        }
        return ufoID;

    } //same

    @Override
    public String toString() {
        String[] ufosID = this.flota.keySet().toArray(new String[flota.size()]);
        Arrays.sort(ufosID);
        return List.of(ufosID).toString();
    }

    boolean containsCard(String cardNumber) {
        return this.flota.containsValue(cardNumber);
    }

    Collection<String> cardNumbers() {
        return this.flota.values();
    }

}
