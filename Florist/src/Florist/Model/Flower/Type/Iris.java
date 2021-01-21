package Florist.Model.Flower.Type;

import Florist.Model.Flower.Flower;
import Florist.Settings.FlowerFreshness;

public class Iris extends Flower {
    public Iris(double price, FlowerFreshness freshness, double lengthOfStem) {
        super("Iris", price, freshness, lengthOfStem);
    }
}