package Apartment;

public class Furniture {
    private String name;
    private final String material;
    private final Size size;

    public Furniture(String name, String material, Size size) {
        this.name = name;
        this.material = material;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

}
