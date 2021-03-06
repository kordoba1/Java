package Florist.Model.Accessories;

import Florist.Settings.AccessoriesColor;

public abstract class Accessories {
    private final String nameAccessories;
    private final double price;
    private final AccessoriesColor color;

    public Accessories(String nameAccessories, AccessoriesColor color, double price) {
        this.color = color;
        this.price = price;
        this.nameAccessories = nameAccessories;
    }

    public AccessoriesColor getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getNameAccessories() {
        return nameAccessories;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "nameAccessories='" + nameAccessories + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
