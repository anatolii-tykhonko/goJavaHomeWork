package com.anatoliy.practice.modul03.task031;


public class Bird {
    private static final String WORD = "I am walking\n" +
                                 "I am flying\n" +
                                 "I am singing\n" +
                                 "I am Bird";
    private String name;

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }


    public void sing() {
        if (name != null) {
            System.out.println("I am " + name);
            System.out.println(WORD);
        } else System.out.println(WORD);
        System.out.println();
    }
}
