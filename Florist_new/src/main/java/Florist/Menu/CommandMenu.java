package Florist.Menu;

import Florist.Menu.Commands.Command;
import Florist.Model.Bouquet;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandMenu {
    private static final Logger LOGGER = Logger.getLogger(CommandMenu.class.getName());
    Map<String, Command> menuItems;

    public CommandMenu() {
        menuItems = new HashMap<>();
    }

    public void setCommand(String operation, Command cmd) {
        menuItems.put(operation, cmd);
        LOGGER.log(Level.FINE, "setCommand() created %s command", operation);
    }

    public void runCommand(String operation, Bouquet bouquet) {
        menuItems.get(operation).execute(bouquet);
        LOGGER.log(Level.FINE, "runCommand() executed %s command", operation);
    }
}
