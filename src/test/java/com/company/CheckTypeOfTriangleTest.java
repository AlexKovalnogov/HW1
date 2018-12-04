package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTypeOfTriangleTest {
    CheckTypeOfTriangle checkTypeOfTriangle;

    @Before
    public void setUp()  {
        checkTypeOfTriangle = new CheckTypeOfTriangle();
    }

    @Test
    public void checkTriangleCase1() {
        assertEquals("Length of Side can't be with minus", checkTypeOfTriangle.checkTriangle(3, 5, -1));
    }

    @Test
    public void checkTriangleCase2() {
        assertEquals("Triangle doesn't exsist", checkTypeOfTriangle.checkTriangle(3, 3, 7));
    }

    @Test
    public void checkTriangleCase3() {
        assertEquals("Triangle is right angled", checkTypeOfTriangle.checkTriangle(3, 4, 5));
    }


    @Test
    public void checkTriangleCase4() {
        assertEquals("Triangle is not right angled", checkTypeOfTriangle.checkTriangle(3, 4, 6));
    }

}