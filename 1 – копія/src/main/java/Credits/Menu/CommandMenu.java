package Credits.Menu;

import Credits.Menu.Commands.Command;
import Credits.Model.Client;
import Credits.Model.Credit.Credit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandMenu {
    private static final Logger LOGGER = Logger.getLogger( CommandMenu.class.getName() );
    Map<String, Command> menuItems;

    public CommandMenu() {
        menuItems = new HashMap<String, Command>();
    }

    public void setCommand(String operation, Command cmd) {
        menuItems.put(operation, cmd);
        LOGGER.log( Level.FINE, "setCommand() created %s command", operation );
    }

    public void runCommand(String operation, ArrayList<Credit> credit, Client client) {
        menuItems.get(operation).execute(credit, client);
        LOGGER.log( Level.FINE, "runCommand() executed %s command", operation );
    }
}
