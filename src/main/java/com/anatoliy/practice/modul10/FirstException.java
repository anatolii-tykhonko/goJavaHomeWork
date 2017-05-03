package com.anatoliy.practice.modul10;

/**
 * Created by anaatolii on 03.05.17.
 */
public class FirstException extends Exception {
    private String message;
    public FirstException() {
        message = "First Exseption";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
