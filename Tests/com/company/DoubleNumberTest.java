package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleNumberTest {

    @Test
    public void functionDoubleNumberCase1() {
        DoubleNumber doubleNumber = new DoubleNumber();
assertEquals("77",doubleNumber.FunctionDoubleNumber(7));
    }
    @Test
    public void functionDoubleNumberCase2() {
        DoubleNumber doubleNumber = new DoubleNumber();
        assertEquals("00",doubleNumber.FunctionDoubleNumber(0));
    }

    @Test
    public void functionDoubleNumberCase3() {
        DoubleNumber doubleNumber = new DoubleNumber();
        assertEquals("77",doubleNumber.FunctionDoubleNumber(-7));
    }




}