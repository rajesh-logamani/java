/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.learn.java.basics;

import org.jetbrains.annotations.NotNull;

/**
 * @author lspra
 */
public class LearnJavaBasics {

    public static void main(String[] args) {
        int []a = new int[3];
        int []b = new int[3];
        System.out.println(a);
        System.out.println(b);
        System.out.println("Hello World!");
        System.out.println(StringReverse("Hello World"));
    }

    public static String StringReverse(String inputstring) {
        String reversedString = "";
        System.out.println("length" + inputstring.length());
        for (int i = inputstring.length() - 1; i >= 0; i--) reversedString += inputstring.charAt(i);
        return  reversedString;
    }
}
