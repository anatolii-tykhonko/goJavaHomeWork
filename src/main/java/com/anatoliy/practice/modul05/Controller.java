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
        System.out.println("Поиск по всем апи по заданым параметрам");
        Room[] arrayRoomsFind = new Room[apis.length * 10];
        int positionInNewArray = 0;
        for (int i = 0; i < apis.length; i++) {
            if (apis[i].findRooms(price, person, city) != null) {

                System.arraycopy(apis[i].findRooms(price, person, city), 0, arrayRoomsFind, positionInNewArray, apis[i].findRooms(price, person, city).length);
                positionInNewArray += apis[i].findRooms(price, person, city).length;
            }
        }


        return chekNullArray(arrayRoomsFind, positionInNewArray);
    }

    private Room[] chekNullArray(Room[] roomsArray, int lenght) {
        Room[] roomsNoNull = new Room[lenght];
        int index = 0;
        for (int i = 0; i < roomsArray.length; i++) {
            if (roomsArray[i] != null) {
                roomsNoNull[index] = roomsArray[i];
                index++;

            }
        }
        return roomsNoNull;
    }

    public Room[] check(API api1, API api2) {
        System.out.println("Выводит одинаковые комнаты из 2 разных апи");
        System.out.println("api1 : " + api1.getClass().getSimpleName()+ " and " + "api2 : " + api2.getClass().getSimpleName());
        Room[] roomsAPI1 = api1.getRooms();
        Room[] roomsAPI2 = api2.getRooms();
        Room[] roomsSameResult = new Room[5];
        int indexRoomsSameResult = 0;
        for (int i = 0; i < roomsAPI1.length; i++) {
            for(Room room : roomsAPI2){
                if(roomsAPI1[i].equals(room)){
                    roomsSameResult[indexRoomsSameResult] = roomsAPI1[i];
                    indexRoomsSameResult++;
                }
            }
        }
        return roomsSameResult;
    }

    public Room save(Room room){
        return getApis(1).getDAO().save(room);
    }

    public boolean delete(Room room){
       return getApis(0).getDAO().delete(room);
    }

    public Room update(Room room){
        return getApis(2).getDAO().update(room);
    }

    public Room findById(long id){
        return getApis(0).getDAO().findById(id);
    }

}
