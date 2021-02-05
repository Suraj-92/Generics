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
    @Test
    public void firstPositionFloatIsMaximum(){
        Maximum maximum = new Maximum();
        float xFloat = 4.3f;
        float yFloat = 8.8f;
        float zFloat = 5.5f;
        maximum.testMaximum1(xFloat, yFloat, zFloat);
        Assertions.assertEquals(8.8f,4.3f);
    } @Test
    public void secondPositionFloatIsMaximum(){
        Maximum maximum = new Maximum();
        Float xFloat = 4.3f, yFloat = 8.8f, zFloat = 5.5f;
        maximum.testMaximum1(xFloat, yFloat, zFloat);
        Assertions.assertEquals(8.8f,8.8f);
    } @Test
    public void thirdPositionFloatIsMaximum(){
        Maximum maximum = new Maximum();
        Float xFloat = 4.3f, yFloat = 8.8f, zFloat = 5.5f;
        maximum.testMaximum1(xFloat, yFloat, zFloat);
        Assertions.assertEquals(8.8f,5.5f);
    }

}
