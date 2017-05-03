package com.anatoliy.practice.modul10;

/**
 * Created by anaatolii on 03.05.17.
 */
public class MyException extends Exception {


    public MyException(String message) {
    super(message);
    }

    public void printMessage(){
        System.out.println(this.getMessage());
    }
}
