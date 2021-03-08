package edu.pingpong.Ricksy_bussiness;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class UfosParkTest{
    CreditCard creditCardAbra = new CreditCard("Abrahadolf", "555");
    UfosPark ufosPark = new UfosPark();


    @Before
    public void setUpUfosPark(){
        assertNotNull(ufosPark);
        ufosPark.add("Hola");
        ufosPark.add("Bon");
        ufosPark.add("Dia");
        ufosPark.add("Uwu");
    }

    @Test
    public void nullTest(){
        for (String number: ufosPark.cardNumbers()){
        assertEquals(null, number);}
    };

    @Test
    public void notNullTest(){
        Collection <String> cards;
        ufosPark.dispatch(creditCardAbra);
        cards = ufosPark.cardNumbers();
        assertNotNull(ufosPark.getUfoOf("555"));
        assertEquals(1, cards.stream().filter(c -> c!= null).count() );
    }

}









    

