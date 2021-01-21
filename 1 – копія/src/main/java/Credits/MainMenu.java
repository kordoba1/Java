package Credits;

import Credits.Menu.CommandMenu;
import Credits.Menu.Commands.*;
import Credits.Model.Client;
import Credits.Model.Credit.Credit;
import Credits.Model.Credit.Type.Commercial;
import Credits.Model.Credit.Type.Consumer;
import Credits.Model.Credit.Type.Mortgage;
import Credits.Settings.Bank;
import Credits.Settings.CommandName;
import Credits.Settings.MenuItem;
import Credits.Settings.MenuItemName;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenu {
    static boolean creditChosen;
    private static final Logger LOGGER = Logger.getLogger( MainMenu.class.getName() );
    private final ArrayList<Credit> credits;
    private final Client client;
    private final CommandMenu command;

    public MainMenu() {
        creditChosen = false;
        credits = new ArrayList<>();
        client = createNewClient();
        command = new CommandMenu();

        credits.add(new Commercial(13.6, 500000, 120, Bank.ALFA, true, true));
        credits.add(new Consumer(17.2, 1000000, 240, Bank.PRIVAT, false, true));
        credits.add(new Mortgage(10.1, 750000, 80, Bank.MONO, true, true));

        command.setCommand(CommandName.CHOOSE_CREDIT_COMMAND.getName(), new ChooseCreditCommand());
        command.setCommand(CommandName.SHOW_CHOSEN_CREDIT_COMMAND.getName(), new ShowChosenCreditCommand());
        command.setCommand(CommandName.SHOW_AVAILABLE_CREDITS_COMMAND.getName(), new ShowAvailableCreditsCommand());
        command.setCommand(CommandName.INCREASE_CREDIT_LINE_COMMAND.getName(), new IncreaseCreditLineCommand());
        command.setCommand(CommandName.SEARCH_CREDIT_BY_CRITERIA_COMMAND.getName(), new SearchCreditByCriteriaCommand());
        command.setCommand(CommandName.MAKE_EARLY_REPAYMENT_COMMAND.getName(), new MakeEarlyRepaymentCommand());
    }

    void run() {
        LOGGER.log( Level.FINE, "run()" );
        boolean quit = false;
        while (!quit) {
            showMenu();
            switch(getMenuItem()) {
                case CHOOSE_CREDIT: command.runCommand(CommandName.CHOOSE_CREDIT_COMMAND.getName(), credits, client); break;
                case SHOW_CHOSEN: command.runCommand(CommandName.SHOW_CHOSEN_CREDIT_COMMAND.getName(), credits, client); break;
                case SHOW_AVAILABLE: command.runCommand(CommandName.SHOW_AVAILABLE_CREDITS_COMMAND.getName(), credits, client); break;
                case INCREASE_CREDIT_LINE: command.runCommand(CommandName.INCREASE_CREDIT_LINE_COMMAND.getName(), credits, client); break;
                case SEARCH_CREDIT_BY_CRITERIA: command.runCommand(CommandName.SEARCH_CREDIT_BY_CRITERIA_COMMAND.getName(), credits, client); break;
                case MAKE_EARLY_REPAYMENT: command.runCommand(CommandName.MAKE_EARLY_REPAYMENT_COMMAND.getName(), credits, client); break;
                case EXIT: quit = true; break;
            }
        }
    }

    private void showMenu() {
        System.out.print(MenuItemName.CHOOSE_CREDIT_ITEM.getName() +
                MenuItemName.SHOW_CHOSEN_CREDIT_ITEM.getName() +
                MenuItemName.SHOW_AVAILABLE_CREDITS_ITEM.getName() +
                MenuItemName.INCREASE_CREDIT_LINE_ITEM.getName() +
                MenuItemName.SEARCH_CREDIT_BY_CRITERIA_ITEM.getName() +
                MenuItemName.MAKE_EARLY_REPAYMENT_ITEM.getName() +
                MenuItemName.EXIT.getName());
    }

    private MenuItem getMenuItem() {
        int item;
        Scanner in = new Scanner(System.in);
        do {
            System.out.format("choose menu item -> ");
            item = in.nextInt();
            if (item == MenuItem.CHOOSE_CREDIT.getValue()) {
                System.out.println("Please choose credit first");
                creditChosen = true;
            }
        } while(!creditChosen && item != MenuItem.EXIT.getValue() ||
                item < MenuItem.LOWER_LIMIT.getValue() ||
                MenuItem.UPPER_LIMIT.getValue() < item);

        LOGGER.log(Level.FINE, "getMenuItem() returned %d menu item", item);
        return MenuItem.values()[item];
    }

    private Client createNewClient() {
        return new Client("Iryna", "Faryna", 1000000);
    }
}
