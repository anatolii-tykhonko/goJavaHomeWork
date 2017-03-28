package com.anatoliy.practice.modul05;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        Room[] ss = c.check(c.getApis(0), c.getApis(2));

        for(Room room : ss){
            if(room != null) {
                System.out.println(room);
            }
        }
        System.out.println("Выводит результат поиска по параметрам во всех апи");
        for (Room room : c.requstRooms(200, 3, "Kiev")) {
            System.out.println(room);
            c.getApis(0).getDAO().save(room);
        }
        System.out.println("Поиск завершен");
        System.out.println("Новые параметры поиска");
        for(Room room : c.requstRooms(300, 2, "Lviv")){
            System.out.println(room);
        }
        System.out.println("Поиск завершен");

        System.out.println("Доп задание");
        //System.out.println(c.getApis(1).getDAO().getAll());
        Room[] rommsAll = c.getApis(2).getDAO().getAll();
        for(Room room : rommsAll){
            System.out.println(room);
        }
    }
}
