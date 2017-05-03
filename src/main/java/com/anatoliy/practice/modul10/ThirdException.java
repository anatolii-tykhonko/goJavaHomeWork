package com.anatoliy.practice.modul10;

/**
 * Created by anaatolii on 03.05.17.
 */
public class ThirdException extends Exception {
    private String message;

    public ThirdException() {
        message = "Third Exception";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
