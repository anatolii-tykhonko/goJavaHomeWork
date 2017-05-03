package com.anatoliy.practice.modul10;

import com.anatoliy.practice.modul07.task071.Order;

/**
 * Created by anaatolii on 03.05.17.
 */
public class Main {
    public static void main(String[] args) {
        String firstException = "first exeption";
        Order order = null;
        try{
            throw new  Exception(firstException);
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("Incide finally block");
            System.out.println();
        }
        try{
            throw new MyException("My exeprion");
        } catch (MyException myException) {
            myException.printMessage();
            System.out.println();
        }
        try {
            order.getClass();
        } catch (Exception e) {
            System.out.println("Type exception is: " + e);
            System.out.println();
        }
        TestException testException = new TestException();
        try {
            testException.g();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println();
        }
        ClassWithThreeExceptions classWithThreeExceptions = new ClassWithThreeExceptions();
        try {
            classWithThreeExceptions.methodWithThreeExceptions();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
