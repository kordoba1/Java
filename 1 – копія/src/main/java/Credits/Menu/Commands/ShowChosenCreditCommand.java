package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowChosenCreditCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(ShowChosenCreditCommand.class.getName());

    @Override
    public void execute(ArrayList<Credit> credit, Client client) {
        LOGGER.log(Level.FINE, "execute()");
        System.out.println("Your credit is " + client.getCredit());
    }
}