package Florist.Menu.Commands;

import Florist.Model.Bouquet;
import Florist.Model.Flower.Type.Rose;
import Florist.Settings.FlowerFreshness;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddFlowerCommandTest {

    @Test
    void execute() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose(10, FlowerFreshness.FRESH, 19));
        assertTrue(bouquet.getFlowersList().size() != 0);
    }

}