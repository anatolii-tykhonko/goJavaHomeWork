package com.anatoliy.practice.modul05;

public class DAOImpl implements DAO{

    Room[] roomDB = new Room[10];

    public Room save(Room room) {
        int count = getRoomsCount(roomDB);
        roomDB[count] = room;
        return room;
    }

    private int getRoomsCount(Room[] roomDB) {
        int count = 0;
        for(Room room : roomDB){
            if(room != null){
                count++;
            }
        }
        return count;
    }

    public boolean delete(Room room) {
        for (int i = 0; i < roomDB.length; i++) {
            Room roomInd = roomDB[i];
            if(room.equals(roomInd)){
                System.arraycopy(roomDB, i - 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length -1] = null;
            }
        }
        return false;
    }

    public Room update(Room room) {
        for (int i = 0; i < roomDB.length; i++) {
            if(room.getId() == roomDB[i].getId()){
                roomDB[i] = room;
            }
        }
        return room;
    }

    public Room findById(long id) {
        for(Room room : roomDB){
            if(room != null && room.getId() == id){
                return room;
            }
        }
        return null;
    }
}
