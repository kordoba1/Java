package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MakeEarlyRepaymentCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger( MakeEarlyRepaymentCommand.class.getName() );

    @Override
    public void execute(ArrayList<Credit> credits, Client client) {
        LOGGER.log( Level.FINE, "execute()" );
        if (client.getCredit().isPossibilityOfEarlyRepayment()) {
            System.out.print("enter for how many you want to repay the credit: ");
            Scanner in = new Scanner(System.in);
            int money = in.nextInt();
            client.makeEarlyRepayment(money);
        }
        else {
            System.out.print("Your credit has no option to make early repayment");
        }
    }

}