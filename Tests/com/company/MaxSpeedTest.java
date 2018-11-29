package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSpeedTest {

    @Test
    public void compareSpeedHappyPath() {
        MaxSpeed maxSpeed = new MaxSpeed();


      assertEquals(0.0,  maxSpeed.CompareSpeed(-10,10));
    }
}