package Apartment;

import java.util.List;

public class HotelApartment extends Apartment{
    private int price;
    private final String hotelName;
    public HotelApartment(Door entryDoor, List<Room> rooms, String hotelName, int price) {
        super(entryDoor, rooms);
        this.hotelName = hotelName;
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
