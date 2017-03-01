package com.anatoliy.practice.modul05;

public class Controller {
    private API apis[] = new API[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public API getApis(int index) {
        return apis[index];
    }

    public Room[] requstRooms(int price, int person, String city) {
        Room[] roomsFind = new Room[apis.length * 10];
        int positionInArray = 0;
        for (int i = 0; i < apis.length; i++) {
            if (apis[i].findRooms(price, person, city) != null) {
                System.arraycopy(apis[i].findRooms(price, person, city), 0, roomsFind, positionInArray, apis[i].findRooms(price, person, city).length);
                positionInArray = apis[i].findRooms(price, person, city).length;
            }
        }
        return roomsFind;
    }

    public Room[] check(API api1, API api2) {
        Room[] roomClone = new Room[3];
        if(api1.equals(api2)){
            System.arraycopy(roomClone, 0, api1,0, 3);
        }

        return null;
    }
}
