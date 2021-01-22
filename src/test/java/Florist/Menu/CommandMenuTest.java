package Florist.Menu;

import Florist.Menu.Commands.AddCmd.AddFlowerCommand;
import Florist.Model.Bouquet;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class CommandMenuTest {
    private Bouquet bouquet;
    private CommandMenu command;

    @Test
    void setCommand() {
        bouquet = new Bouquet();
        command = new CommandMenu();
        command.setCommand("add flower", new AddFlowerCommand());
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
    }

    @Test
    void runCommand() {
        bouquet = new Bouquet();
        command = new CommandMenu();
        command.setCommand("add flower", new AddFlowerCommand());
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        command.runCommand("add flower", bouquet);
    }

}