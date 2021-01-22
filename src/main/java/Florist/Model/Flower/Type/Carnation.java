package Florist.Model.Flower.Type;

import Florist.Model.Flower.Flower;
import Florist.Settings.FlowerFreshness;

public class Carnation extends Flower {
    public Carnation(double price, FlowerFreshness freshness, double lengthOfStem) {
        super("Carnation", price, freshness, lengthOfStem);
    }
}
