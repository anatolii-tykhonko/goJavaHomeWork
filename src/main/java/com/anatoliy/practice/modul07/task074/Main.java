package com.anatoliy.practice.modul07.task074;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<String>();
        arrayListString.add("sssss");
        ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        arrayListInteger.add(22);
        LinkedList<String> linkedListString = new LinkedList<String>();
        linkedListString.add("sda");
        LinkedList<Integer> linkedListInteger = new LinkedList<Integer>();
        linkedListInteger.add(12);
        printTimeToAddInList(arrayListInteger);
        printTimeToAddInList(linkedListInteger);
        printTimeToAddInList(arrayListString);
        printTimeToAddInList(linkedListString);

        printTimeToSetInList(arrayListInteger);
        printTimeToSetInList(linkedListInteger);
        printTimeToSetInList(arrayListString);
        printTimeToSetInList(linkedListString);

        printTimeToGetInList(arrayListInteger);
        printTimeToGetInList(linkedListInteger);
        printTimeToGetInList(arrayListString);
        printTimeToGetInList(linkedListString);

        printTimeToRemoveInList(arrayListInteger);
        printTimeToRemoveInList(linkedListInteger);
        printTimeToRemoveInList(arrayListString);
        printTimeToRemoveInList(linkedListString);




    }

    public static void printTimeToAddInList(List list) {
        Object o;
        if (list.get(0) instanceof Integer) {
            o = 200;
        } else {
            o = "sssss";
        }
        Date beginAddList = new Date();
        for (int i = 0; i < 10000; i++) {
            list.add(o);
        }
        Date endAddList = new Date();
        System.out.println("Время для добавления " + list.getClass().getSimpleName() + " = " + (endAddList.getTime() - beginAddList.getTime()));
    }

    public static void printTimeToSetInList(List list) {
        Object o;
        if (list.get(0) instanceof Integer) {
            o = 200;
        } else {
            o = "sssss";
        }
        Date beginSetList = new Date();
        for (int i = 0; i < 10000; i++) {
            int j = list.size() / 2;
            list.set(j, o);
        }
        Date endSetList = new Date();
        System.out.println("Время для добавления в середину " + list.getClass().getSimpleName() + " = " + (endSetList.getTime() - beginSetList.getTime()));
    }

    public static void printTimeToGetInList(List list) {
        Date beginGetList = new Date();
        for (int i = 0; i < 10000; i++) {
            list.get(list.size() / 2 - 1);
        }
        Date endGetList = new Date();
        System.out.println("Время для вывода элемента " + list.getClass().getSimpleName() + " = " + (endGetList.getTime() - beginGetList.getTime()));
    }

    public static void printTimeToRemoveInList(List list) {
        Date beginRemoveList = new Date();
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
        Date endRemoveList = new Date();
        System.out.println("Время для удаления элемента " + list.getClass().getSimpleName() + " = " + (endRemoveList.getTime() - beginRemoveList.getTime()));
    }

}
