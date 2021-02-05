package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    @Test
    public void FirstPositionValueIsMaximum(){
        Maximum maximum = new Maximum(4,3,2);

        Integer xInt = 4, yInt = 3, zInt = 2;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(4,4);

        Float xF1 = 4.4f, yF1 = 3.3f, zF1 = 1.1f;
        Assertions.assertEquals(4.4f,4.4f);


        String xStr = "Orange", yStr = "Apple", zStr="Banana";
        Maximum.testMaximum(xStr, yStr, zStr);
        Assertions.assertEquals("Orange","Orange");

        new Maximum(xInt, yInt, zInt).maximum();
        new Maximum(xStr, yStr, zStr).maximum();
        new Maximum(xF1, yF1, zF1).maximum();

    }
    @Test
    public void secondPositionValueIsMaximum(){
        Maximum maximum = new Maximum(4,3,2);

        Integer xInt = 4, yInt = 3, zInt = 2;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(4,3);

        Float xF1 = 4.4f, yF1 = 3.3f, zF1 = 1.1f;
        Assertions.assertEquals(4.4f,3.3f);

        String xStr = "Orange", yStr = "Apple", zStr="Banana";
        Maximum.testMaximum(xStr, yStr, zStr);
        Assertions.assertEquals("Orange","Apple");

        new Maximum(xInt, yInt, zInt).maximum();
        new Maximum(xStr, yStr, zStr).maximum();
        new Maximum(xF1, yF1, zF1).maximum();

    }
    @Test
    public void thirdPositionValueIsMaximum(){

        Maximum maximum = new Maximum(4,3,2);

        Integer xInt = 4, yInt = 3, zInt = 2;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(4,2);

        Float xF1 = 4.4f, yF1 = 3.3f, zF1 = 1.1f;
        Assertions.assertEquals(4.4f,1.1f);

        String xStr = "Orange", yStr = "Apple", zStr="Banana";
        Maximum.testMaximum(xStr, yStr, zStr);
        Assertions.assertEquals("Orange","Banana");

        new Maximum(xInt, yInt, zInt).maximum();
        new Maximum(xStr, yStr, zStr).maximum();
        new Maximum(xF1, yF1, zF1).maximum();
    }
}
