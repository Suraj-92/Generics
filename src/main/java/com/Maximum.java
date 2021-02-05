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
}