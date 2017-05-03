package com.anatoliy.practice.modul10;

/**
 * Created by anaatolii on 03.05.17.
 */
public class ClassWithThreeExceptions {
    public void methodWithOneException() throws FirstException {
        throw new FirstException();
    }
    public void methodWithTwoExceptions() throws SecondException {
        try {
            methodWithOneException();
        } catch (FirstException e) {
            System.out.println(e.getMessage());
            throw new SecondException();
        }
    }
    public void methodWithThreeExceptions() throws ThirdException {
        try {
            methodWithTwoExceptions();
        } catch (SecondException e) {
            System.out.println(e.getMessage());
            throw new ThirdException();
        }
    }
}
