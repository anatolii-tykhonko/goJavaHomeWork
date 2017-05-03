package com.anatoliy.practice.modul10;

/**
 * Created by anaatolii on 03.05.17.
 */
public class SecondException extends Exception {
    private String message;

    public SecondException(){
        message = "Second Exception";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
