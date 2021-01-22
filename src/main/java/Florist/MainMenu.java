package Florist;

import Florist.Menu.CommandMenu;
import Florist.Menu.Commands.*;
import Florist.Menu.Commands.AddCmd.AddAccessoryCommand;
import Florist.Menu.Commands.AddCmd.AddFlowerCommand;
import Florist.Model.Bouquet;
import Florist.Settings.CommandName;
import Florist.Settings.MenuItem;
import Florist.Settings.MenuItemName;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenu {
    private static final Logger LOGGER = Logger.getLogger(MainMenu.class.getName());
    private final Bouquet bouquet;
    private final CommandMenu command;

    public MainMenu() {
        bouquet = new Bouquet();
        command = new CommandMenu();

        command.setCommand(CommandName.ADD_FLOWER_COMMAND.getName(), new AddFlowerCommand());
        command.setCommand(CommandName.ADD_ACCESSORY_COMMAND.getName(), new AddAccessoryCommand());
        command.setCommand(CommandName.SORT_FLOWER_COMMAND.getName(), new SortFlowersCommand());
        command.setCommand(CommandName.FIND_FLOWER_COMMAND.getName(), new FindFlowerCommand());
        command.setCommand(CommandName.SHOW_BOUQUET_COMMAND.getName(), new ShowBouquetCommand());
        command.setCommand(CommandName.CALCULATE_BOUQUET_COMMAND.getName(), new CalculateBouquetCommand());
    }

    void run() {

        boolean quit = false;
        while (!quit) {
            showMenu();
            switch(getMenuItem()) {
                case ADD_FLOWER: command.runCommand(CommandName.ADD_FLOWER_COMMAND.getName(), bouquet); break;
                case ADD_ACCESSORY: command.runCommand(CommandName.ADD_ACCESSORY_COMMAND.getName(), bouquet); break;
                case SORT: command.runCommand(CommandName.SORT_FLOWER_COMMAND.getName(), bouquet); break;
                case FIND: command.runCommand(CommandName.FIND_FLOWER_COMMAND.getName(), bouquet); break;
                case SHOW: command.runCommand(CommandName.SHOW_BOUQUET_COMMAND.getName(), bouquet); break;
                case PRICE: command.runCommand(CommandName.CALCULATE_BOUQUET_COMMAND.getName(), bouquet); break;
                case EXIT: quit = true; break;
            }
        }
    }

    private void showMenu() {
        System.out.print(MenuItemName.ADD_FLOWER_ITEM.getName() +
                MenuItemName.ADD_ACCESSORY_ITEM.getName() +
                MenuItemName.SORT_FLOWER_ITEM.getName() +
                MenuItemName.FIND_FLOWER_ITEM.getName() +
                MenuItemName.SHOW_BOUQUET_ITEM.getName() +
                MenuItemName.CALCULATE_BOUQUET_ITEM.getName() +
                MenuItemName.EXIT.getName());
    }

    private MenuItem getMenuItem() {
        int item;
        Scanner in = new Scanner(System.in);
        do {
            System.out.format("choose menu item -> ");
            item = in.nextInt();
        } while(item < MenuItem.LOWER_LIMIT.getValue() ||
                MenuItem.UPPER_LIMIT.getValue() < item);

        LOGGER.log(Level.FINE, "getMenuItem() returned %d menu item", item);
        return MenuItem.values()[item];
    }
}
