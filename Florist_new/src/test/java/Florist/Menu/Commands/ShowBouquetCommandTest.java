package Florist.Menu.Commands;

import Florist.Model.Bouquet;
import Florist.Model.Flower.Type.Iris;
import Florist.Model.Flower.Type.Rose;
import Florist.Model.Flower.Type.Tulip;
import Florist.Settings.FlowerFreshness;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowBouquetCommandTest {

    @Test
    void execute() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose(10, FlowerFreshness.FRESH, 67));
        bouquet.addFlower(new Tulip(5, FlowerFreshness.FRESH, 45));
        bouquet.addFlower(new Iris(13, FlowerFreshness.FRESH, 23));
        bouquet.showBouquet();
    }
}