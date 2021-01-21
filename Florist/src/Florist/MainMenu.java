package Florist;

import Florist.Menu.CommandMenu;
import Florist.Menu.Commands.*;
import Florist.Model.Bouquet;
import Florist.Settings.MenuItem;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenu {
    private static final Logger LOGGER = Logger.getLogger( MainMenu.class.getName() );
    private final Bouquet bouquet;
    private final CommandMenu command;

    public MainMenu() {
        bouquet = new Bouquet();
        command = new CommandMenu();

        command.setCommand("add flower", new AddFlowerCommand());
        command.setCommand("add accessory", new AddAccessoryCommand());
        command.setCommand("sort", new SortFlowersCommand());
        command.setCommand("find", new FindFlowerCommand());
        command.setCommand("show", new ShowBouquetCommand());
    }

    void run() {
        boolean quit = false;
        while (!quit) {
            showMenu();
            switch(getMenuItem()) {
                case ADD_FLOWER: command.runCommand("add flower", bouquet); break;
                case ADD_ACCESSORY: command.runCommand("add accessory", bouquet); break;
                case SORT: command.runCommand("sort", bouquet); break;
                case FIND: command.runCommand("find", bouquet); break;
                case SHOW: command.runCommand("show", bouquet); break;
                case EXIT: quit = true; break;
            }
        }
    }

    private void showMenu() {
        System.out.print("1 - add a flower to the bouquet\n" +
            "2 - add a accessory to the bouquet\n" +
            "3 - sort flowers in the bouquet by freshness\n" +
            "4 - find flower in range of stem length\n" +
            "5 - show bouquet\n" +
            "6 - exit\n");
    }

    private MenuItem getMenuItem() {
        int item;
        Scanner in = new Scanner(System.in);
        do {
            System.out.format("choose menu item -> ");
            item = in.nextInt();
        } while(item < MenuItem.LOWER_LIMIT.getValue() ||
                MenuItem.UPPER_LIMIT.getValue() < item);

        LOGGER.log( Level.FINE, "getMenuItem() returned %d", item);
        return MenuItem.values()[item];
    }
}
