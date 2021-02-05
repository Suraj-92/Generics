package com;

class Maximum {


    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
        public static String testMaximum(String x, String y, String z){
            String max = x;
            if(y.compareTo(max)>0)
            {
                max = y;
            }
            if(z.compareTo(max)>0)
            {
                max = z;
            }
            return max;
        }
    }
