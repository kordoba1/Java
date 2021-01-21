package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IncreaseCreditLineCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger( IncreaseCreditLineCommand.class.getName() );
    @Override
    public void execute(ArrayList<Credit> credit, Client client) {
        LOGGER.log(Level.FINE, "execute()");
        if (client.getCredit().isPossibilityOfLineIncrease()) {
            System.out.print("enter for how many months you want increase credit line: ");
            Scanner in = new Scanner(System.in);
            int creditNumber = in.nextInt();
            client.getCredit().increaseCreditLine(creditNumber);
        }
        else {
            System.out.print("Your credit has no option to increase credit line");
        }
    }
}