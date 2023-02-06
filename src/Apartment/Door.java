package Apartment;

public class Door {
    private final Size size;
    private final int weight;
    private final String material;

    public Door(Size size, int weight, String material) {
        this.size = size;
        this.weight = weight;
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }
}
