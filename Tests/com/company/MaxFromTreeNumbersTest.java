package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxFromTreeNumbersTest {

    @Test
    public void maxNumberCase1() {

        MaxFromTreeNumbers maxFromTreeNumbers = new MaxFromTreeNumbers();
       assertEquals(5 ,maxFromTreeNumbers.MaxNumber(3,4,5));

    }

    @Test
    public void maxNumberCase2() {

        MaxFromTreeNumbers maxFromTreeNumbers = new MaxFromTreeNumbers();
        assertEquals(34 ,maxFromTreeNumbers.MaxNumber(34,-10,5));

    }
}