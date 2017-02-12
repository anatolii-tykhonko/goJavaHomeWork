package com.anatoliy.practice.modul03.task032;


public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        System.out.println(arithmetic.add(8 , 8));
        System.out.println(adder.check(8, 5));
        System.out.println(adder.add(3, 9));
    }
}
