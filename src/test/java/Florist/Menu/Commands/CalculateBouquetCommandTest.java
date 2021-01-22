package Florist.Menu.Commands;

import Florist.Model.Accessories.Type.Tape;
import Florist.Model.Bouquet;
import Florist.Model.Flower.Type.Rose;
import Florist.Settings.AccessoriesColor;
import Florist.Settings.FlowerFreshness;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateBouquetCommandTest {

    @Test
    void execute() {
        Bouquet bouquet = new Bouquet();
        Rose rose = new Rose(300, FlowerFreshness.FRESH, 200);
        Tape tape = new Tape(AccessoriesColor.BLUE, 15);
        bouquet.addFlower(rose);
        bouquet.addAccessory(tape);
        assertEquals(315, bouquet.getPrice());
    }
}