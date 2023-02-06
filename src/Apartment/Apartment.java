package Apartment;

import java.util.List;

public class Apartment {
    private Door entryDoor;
    private List<Room> rooms;

    public Apartment(Door entryDoor, List<Room> rooms) {
        this.entryDoor = entryDoor;
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Door getEntryDoor() {
        return entryDoor;
    }

    public void setEntryDoor(Door entryDoor) {
        this.entryDoor = entryDoor;
    }

    public int getNumberOfRooms() {
        return rooms.size();
    }
}
