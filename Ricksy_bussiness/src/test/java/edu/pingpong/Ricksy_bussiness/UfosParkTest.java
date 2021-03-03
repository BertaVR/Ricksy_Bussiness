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
    UfosPark ufosPark;


    @Before
    public void setUpUfosPark(){
        UfosPark ufosPark = new UfosPark();
        assertNotNull(ufosPark);
        ufosPark.add("Hola");
        ufosPark.add("Bon");
        ufosPark.add("Dia");
        ufosPark.add("Uwu");
    }

    @Test
    public void nullTest(){
        Collection <String> cards;
        cards = ufosPark.cardNumbers();
        assertEquals(0,cards.size());}
    }







    

