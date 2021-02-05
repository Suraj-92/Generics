package com;

class Maximum{

    public Integer testMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max)>0)
        {
            max = y;
        }
        if (z.compareTo(max)>0)
        {
            max = z;
        }
        return max;
    }
    public Float testMaximum1(  Float x, Float y, Float z) {
        Float max = x;
        if(y.compareTo(max)>0)
        {
            max = y;
        }
        if (z.compareTo(max)>0)
        {
            max = z;
        }
        return max;
    }
    public String testMaximum1(  String x, String y, String z) {
        String  max = x;
        if(y.compareTo(max)>0)
        {
            max = y;
        }
        if (z.compareTo(max)>0)
        {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    private void printMax(String x, String y, String z, String max) {
        System.out.println(max);
    }
}