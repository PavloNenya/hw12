import Apartment.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating sizes for furniture
        Size chairSize = new Size(0.5, 1.3, 0.5);
        Size doorSize = new Size(1.5, 2.5, 0.10);
        Size tableSize = new Size(2, 1.2, 3);
        Size couchSize = new Size(2.4, 1.1, 2.6);
        Size cupboardSize = new Size(1, 0.7, 0.8);

        //creating entry door
        Door door = new Door(doorSize, 35, "Steel");

        Furniture chair = new Furniture("Chair", "Wood", chairSize);
        Furniture table = new Furniture("Table", "Wood", tableSize);
        Furniture couch = new Furniture("Couch", "Leather", couchSize);
        Furniture cupboard = new Furniture("Cupboard", "Wood", cupboardSize);

        List<Furniture> kitchenFurniture = new ArrayList<Furniture>();
        kitchenFurniture.add(table);
        kitchenFurniture.add(chair);
        kitchenFurniture.add(chair);
        kitchenFurniture.add(chair);
        kitchenFurniture.add(chair);
        kitchenFurniture.add(cupboard);

        List<Furniture> livingRoomFurniture = new ArrayList<Furniture>();
        livingRoomFurniture.add(chair);
        livingRoomFurniture.add(chair);
        livingRoomFurniture.add(couch);
        livingRoomFurniture.add(table);

        Room kitchen = new Room("Kitchen", kitchenFurniture);
        Room livingRoom = new Room("Living room", livingRoomFurniture);

        List<Room> roomList = new ArrayList<Room>();
        roomList.add(kitchen);
        roomList.add(livingRoom);

        Apartment apartment = new Apartment(door, roomList);
        HotelApartment hotelApartment = new HotelApartment(door, roomList, "California", 400);
    }

}