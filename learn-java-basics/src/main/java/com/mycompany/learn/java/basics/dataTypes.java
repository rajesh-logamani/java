package com.mycompany.learn.java.basics;

import static com.mycompany.learn.java.basics.LearnJavaBasics.StringReverse;

public class dataTypes {
    public static void main(String[] args) {
        int[] a = new int[3];
        //push some values to the array a
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        int age = 25;
        String name = "John Doe";

        int[] b = new int[3];
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(b));
        System.out.println("Hello World!!!!!");
        System.out.println(StringReverse("Hello World"));
    }
}
