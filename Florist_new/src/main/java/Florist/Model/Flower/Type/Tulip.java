package Florist.Model.Flower.Type;

import Florist.Model.Flower.Flower;
import Florist.Settings.FlowerFreshness;

public class Tulip extends Flower {
    public Tulip(double price, FlowerFreshness freshness, double lengthOfStem) {
        super("Tulip", price, freshness, lengthOfStem);
    }
}
