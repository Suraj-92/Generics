package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    @Test
    public void FirstPositionValueIsMaximum(){
        Maximum maximum = new Maximum();
        Integer xInt = 4, yInt = 8, zInt = 5;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(8, 4);

        Float xF1 = 3.3f, yF1 = 4.4f, zF1 = 1.1f;
        maximum.testMaximum(xF1, yF1, zF1);
        Assertions.assertEquals(4.4f,3.3f);

        String xStr = "Peach", yStr = "Apple", zStr="Banana";
        maximum.testMaximum(xStr, yStr, zStr);
        Assertions.assertEquals("Apple", "Peach");
    }
    @Test
    public void secondPositionValueIsMaximum(){
        Maximum maximum = new Maximum();
        Integer xInt = 4, yInt = 8, zInt = 5;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(8, 8);

        Float xF1 = 3.3f, yF1 = 4.4f, zF1 = 1.1f;
        maximum.testMaximum(xF1, yF1, zF1);
        Assertions.assertEquals(4.4f,4.4f);

        String xStr = "Peach", yStr = "Apple", zStr="Banana";
        maximum.testMaximum(xStr, yStr, zStr);
        Assertions.assertEquals("Apple", "Apple");
    }
    @Test
    public void thirdPositionValueIsMaximum(){
        Maximum maximum = new Maximum();
        Integer xInt = 4, yInt = 8, zInt = 5;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(8, 5);

        Float xF1 = 3.3f, yF1 = 4.4f, zF1 = 1.1f;
        maximum.testMaximum(xF1, yF1, zF1);
        Assertions.assertEquals(4.4f,1.1f);

        String xStr = "Peach", yStr = "Apple", zStr="Banana";
        maximum.testMaximum(xStr, yStr, zStr);
        Assertions.assertEquals("Apple", "Banana");
    }
}
