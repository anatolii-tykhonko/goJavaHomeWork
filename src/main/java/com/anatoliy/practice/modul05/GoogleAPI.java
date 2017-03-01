package com.anatoliy.practice.modul05;

import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        for (int i = 1; i < 6; i++) {
            rooms[i - 1] = new Room(i + 12, i * 110, i, new Date(), "Ukraine", "Lviv");
        }
    }

    public Room[] findRooms(int price, int persons, String city) {
        Room roomFind = new Room(price, persons, city);
        Room[] roomArray = new Room[rooms.length];
        int index = 0;
        for (Room room : rooms) {
            if (roomFind.equals(room)) {
                roomArray[index] = room;
                index++;
            }
        }
        Room[] roomResult = new Room[index];
        if (index != 0) {

            for (int i = 0; i < index; i++) {
                roomResult[i] = roomArray[i];
            }
        } else {
            return null;
        }
        return roomResult;
    }
}
