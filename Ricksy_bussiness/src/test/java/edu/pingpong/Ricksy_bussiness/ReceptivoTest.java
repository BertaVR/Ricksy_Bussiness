package edu.pingpong.Ricksy_bussiness;

import javax.smartcardio.Card;

import org.junit.Before;
import org.junit.Test;

public class ReceptivoTest {
    @Before
    public void setup() {

        GuestDispatcher menus = new Menus();
        GuestDispatcher crystals = new CrystalExpender(1, 1d);
        GuestDispatcher ufos = new UfosPark();
    }

    @Test
    public void dispatchDone() {
        CreditCard card = new CreditCard("Abrahadolf", "555");
        receptivo.dispatch(card);
    }
}
