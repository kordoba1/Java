package Credits.Menu;

import Credits.Menu.Commands.Command;
import Credits.Model.Client;
import Credits.Model.Credit;

import java.util.ArrayList;
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

    public void runCommand(String operation, ArrayList<Credit> credit, Client client) {
        menuItems.get(operation).execute(credit, client);
    }
}
