package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChooseCreditCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger( ChooseCreditCommand.class.getName() );
    @Override
    public void execute(ArrayList<Credit> credits, Client client) {
        LOGGER.log( Level.FINE, "execute()" );
        showAvailableCredits(credits);
        client.chooseCredit(getChosenCredit(credits));
    }

    private void showAvailableCredits(ArrayList<Credit> credits) {
        LOGGER.log( Level.FINE, "showAvailableCredits()" );
        for (Credit credit: credits) {
            System.out.println(credit);
        }
    }

    private Credit getChosenCredit(ArrayList<Credit> credits) {
        LOGGER.log( Level.FINE, "getChosenCredit()" );
        System.out.println("choose number of credit you want to get");
        Scanner in = new Scanner(System.in);
        int creditNumber = in.nextInt();

        return credits.get(creditNumber);
    }

}