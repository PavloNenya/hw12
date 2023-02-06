package Apartment;

import java.util.List;

public class Room {
    private List<Furniture> furnitureList;
    private String name;
    private double temperature;

    public Room(String name, List<Furniture> furnitureList) {
        this.furnitureList = furnitureList;
        this.name = name;
    }
    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void setFurnitureList(List<Furniture> furnitureList) {
        this.furnitureList = furnitureList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
