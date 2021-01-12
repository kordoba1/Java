package Florist;

import Florist.Menu.CommandMenu;
import Florist.Menu.Commands.CalculateBouquetCommand;
import Florist.Model.Bouquet;
import org.junit.jupiter.api.Test;


class MainMenuTest {

    @Test
    void run() {
        CommandMenu command = new CommandMenu();
        Bouquet bouquet = new Bouquet();
        command.setCommand("price", new CalculateBouquetCommand());
        command.runCommand("price", bouquet);
    }
}