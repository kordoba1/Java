package Florist.Menu;

import Florist.Menu.Commands.Command;
import Florist.Model.Bouquet;

import java.util.HashMap;
import java.util.Map;

public class CommandMenu {
    Map<String, Command> menuItems;

    public CommandMenu() {
        menuItems = new HashMap<String, Command>();
    }

    public void setCommand(String operation, Command cmd) {
        menuItems.put(operation, cmd);
    }

    public void runCommand(String operation, Bouquet bouquet) {
        menuItems.get(operation).execute(bouquet);
    }
}
