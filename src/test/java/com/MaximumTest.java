package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    @Test
    public void firstPositionIntegerIsMaximum(){
        Maximum maximum = new Maximum();
        Integer xInt = 4, yInt = 8, zInt = 5;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(8,4);
    }
    @Test
    public void secondPositionIntegerIsMaximum(){
        Maximum maximum = new Maximum();
        Integer xInt = 4, yInt = 8, zInt = 5;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(8,8);
    }
    @Test
    public void thirdPositionIntegerIsMaximum(){
        Maximum maximum = new Maximum();
        Integer xInt = 4, yInt = 8, zInt = 5;
        maximum.testMaximum(xInt, yInt, zInt);
        Assertions.assertEquals(8,5);
    }
}
