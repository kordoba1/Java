package Florist.Model.Flower;

import Florist.Settings.FlowerFreshness;

public abstract class Flower {
    private final String name;
    private final double price;
    private final FlowerFreshness freshness;
    private final double lengthOfStem;

    public Flower(String name, double price, FlowerFreshness freshness, double lengthOfStem) {
        this.name = name;
        this.price = price;
        this.freshness = freshness;
        this.lengthOfStem = lengthOfStem;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public FlowerFreshness getFreshness() {
        return freshness;
    }

    public double getLengthOfStem() {
        return lengthOfStem;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", freshness=" + freshness +
                ", lengthOfStem=" + lengthOfStem +
                '}';
    }
}
