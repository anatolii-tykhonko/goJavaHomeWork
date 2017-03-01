package com.anatoliy.practice.modul05;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        c.check(c.getApis(0), c.getApis(1));
        //System.out.println(c.requstRooms(120,1, "Kiev"));
        for(Room room : c.requstRooms(120,1, "Kiev")){
            if(room != null) {
                System.out.println(room);
            }
        }
    }
}
