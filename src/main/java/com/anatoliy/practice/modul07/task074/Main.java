package com.anatoliy.practice.modul07.task074;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 * Created by anaatolii on 30.03.17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<String>();
        ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        LinkedList<String> linkedListString = new LinkedList<String>();
        LinkedList<Integer> linkedListInteger = new LinkedList<Integer>();

        Date beginAddIntegerArrayList = new Date();
        for (int i = 0; i < 10000; i++) {
            arrayListInteger.add(i);
        }
        Date endAddIntegerArrayList = new Date();
        System.out.println("Время для добавления arrayList = " + (endAddIntegerArrayList.getTime() - beginAddIntegerArrayList.getTime()));

        Date beginGetIntegerArrayList = new Date();
        for (int i = 0; i < 10000; i++) {
            int j = arrayListInteger.size() / 2;
            arrayListInteger.set(j, i);
        }
        Date endGetIntegerArrayList = new Date();
        System.out.println("Время для добавления в середину arrayList = " + (endGetIntegerArrayList.getTime() - beginGetIntegerArrayList.getTime()));
    }
}
