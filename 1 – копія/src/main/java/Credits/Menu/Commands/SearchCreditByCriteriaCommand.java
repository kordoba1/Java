package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchCreditByCriteriaCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger( SearchCreditByCriteriaCommand.class.getName() );

    @Override
    public void execute(ArrayList<Credit> credits, Client client) {
        LOGGER.log( Level.FINE, "execute()" );
        search(credits);
    }

    private void search(ArrayList<Credit> credits) {
        LOGGER.log( Level.FINE, "search()" );
        try {
            boolean foundRecords = false;
            switch (getCriteria()) {
                case 1: foundRecords = searchByLineIncrease(credits); break;
                case 2: foundRecords = searchByRepayment(credits); break;
            }

            if (!foundRecords)
                System.out.println("There are no such credits");
        }
        catch (InputMismatchException ex) {
            LOGGER.log( Level.SEVERE, ex.toString(), ex );
            System.out.println("Bad input!!!!");
        }
    }

    private int getCriteria() {
        LOGGER.log( Level.FINE, "getCriteria()" );
        System.out.println("1 - search by possibility of credit line increase\n" +
                "2 - search by possibility of early repayment ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }


    private boolean searchByLineIncrease (ArrayList<Credit> credits) {
        LOGGER.log( Level.FINE, "searchByLineIncrease()" );
        boolean foundRecords = false;
        for (Credit credit: credits) {
            if (credit.isPossibilityOfLineIncrease()) {
                System.out.println(credit);
                foundRecords = true;
            }
        }
        return foundRecords;
    }

    private boolean searchByRepayment (ArrayList<Credit> credits) {
        LOGGER.log( Level.FINE, "searchByRepayment()" );
        boolean foundRecords = false;
        for (Credit credit: credits) {
            if (credit.isPossibilityOfEarlyRepayment()) {
                System.out.println(credit);
                foundRecords = true;
            }
        }
        return foundRecords;
    }
}
