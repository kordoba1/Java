package Florist.Menu.Commands;

import Florist.Model.Accessories.Type.Tape;
import Florist.Model.Bouquet;
import Florist.Settings.AccessoriesColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddAccessoryCommandTest {
    Bouquet bouquet;

    @Test
    void execute() {
        bouquet = new Bouquet();
        bouquet.addAccessory(new Tape(AccessoriesColor.BLUE, 19));
        assertTrue(bouquet.getAccessoriesList().size() != 0);
    }
}