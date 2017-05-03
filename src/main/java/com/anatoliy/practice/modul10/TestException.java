package com.anatoliy.practice.modul10;

/**
 * Created by anaatolii on 03.05.17.
 */
public class TestException {

    public void f() throws MyException {
        throw new MyException("test");
    }

    public void g() throws Exception {
        try {
            f();
        } catch (MyException e) {
            e.printMessage();
            throw new Exception("test2");
        }
    }
}
