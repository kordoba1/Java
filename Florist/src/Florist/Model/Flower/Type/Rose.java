package Florist.Model.Flower.Type;

import Florist.Model.Flower.Flower;
import Florist.Settings.FlowerFreshness;

public class Rose extends Flower {
    public Rose(double price, FlowerFreshness freshness, double lengthOfStem) {
        super("Rose", price, freshness, lengthOfStem);
    }
}
