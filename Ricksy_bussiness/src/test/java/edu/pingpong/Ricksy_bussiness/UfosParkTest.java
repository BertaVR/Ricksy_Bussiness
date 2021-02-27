package edu.pingpong.Ricksy_bussiness;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UfosParkTest{
    UfosPark ufosPark = new UfosPark();
    CreditCard creditCardAbra = new CreditCard("Abrahadolf", "555");


    @Before
    public void setUpUfosPark(){
        ufosPark.add("Hola");
        ufosPark.add("Bon");
        ufosPark.add("Dia");
        ufosPark.add("Uwu");

    }
    
    @Test
    public void nulosTest(){
        assertEquals(4, ufosPark.frequency(party.values(), null));
        ufosPark.dispatch(creditCardAbra);
        
    }

    

}