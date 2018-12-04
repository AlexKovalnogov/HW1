package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSpeedTest {

    @Test
    public void compareSpeedCase1() {
        MaxSpeed maxSpeed = new MaxSpeed();
        assertEquals(0.0 ,  maxSpeed.CompareSpeed(-10,10), 0.0);
    }


    @Test
    public void compareSpeedCase2() {
        MaxSpeed maxSpeed = new MaxSpeed();
        assertEquals(100 ,  maxSpeed.CompareSpeed(100,10), 0.0);
    }

}