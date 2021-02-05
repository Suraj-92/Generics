package com;

class Maximum <T extends Comparable<T>>{
    T x, y, z;
public Maximum(T x, T y, T z){
    this.x = x;
    this.y = y;
    this.z = z;
}

    public T maximum() {
        return Maximum.testMaximum(x, y, z);
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
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
            printMax(x, y, z, max);
            return max;
        }
    public static <T> void printMax(T x, T y, T z, T max)
    {
        System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
    }
    }
