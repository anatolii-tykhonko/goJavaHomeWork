package com.anatoliy.practice.modul05;

public interface API {
    Room[] findRooms(int price, int persons, String city);
    Room[] getRooms();
    DAO getDAO();

}
