package com.anatoliy.practice.modul05;

import java.util.Arrays;
import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(11, 200, 3, new Date(), "Ukraine", "Kiev");
        rooms[1] = new Room(12, 200, 2, new Date(), "Ukraine", "Dnepr");
        rooms[2] = new Room(13, 200, 3, new Date(), "Karlos", "Kiev");
        rooms[3] = new Room(14, 400, 2, new Date(), "Vitam", "Lviv");
        rooms[4] = new Room(15, 200, 9, new Date(), "Karlos", "Kiev");
    }

    public Room[] getRooms() {
        return rooms;
    }

    public DAO getDAO() {
        return new DAOImpl();
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
                getDAO().save(roomArray[i]);
            }
        } else {
            return null;
        }
        return roomResult;
    }

    @Override
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
