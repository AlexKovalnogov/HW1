package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTypeOfTriangleTest {




    @Test
    public void checkTriangleCase1() {
        CheckTypeOfTriangle checkTypeOfTriangle = new CheckTypeOfTriangle();
      assertEquals("Length of Side can't be with minus",checkTypeOfTriangle.CheckTriangle(3,5,-1));

    }

    @Test
    public void checkTriangleCase2() {
        CheckTypeOfTriangle checkTypeOfTriangle = new CheckTypeOfTriangle();
        assertEquals("Triangle doesn't exsist",checkTypeOfTriangle.CheckTriangle(3,3,7));

    }

    @Test
    public void checkTriangleCase3() {
        CheckTypeOfTriangle checkTypeOfTriangle = new CheckTypeOfTriangle();
        assertEquals("Triangle is right angled",checkTypeOfTriangle.CheckTriangle(3,4,5));
    }


    @Test
    public void checkTriangleCase4() {
        CheckTypeOfTriangle checkTypeOfTriangle = new CheckTypeOfTriangle();
        assertEquals("Triangle is not right angled",checkTypeOfTriangle.CheckTriangle(3,4,6));

    }


}