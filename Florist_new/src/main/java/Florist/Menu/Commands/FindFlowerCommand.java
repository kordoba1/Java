package Florist.Menu.Commands;

import Florist.Model.Bouquet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindFlowerCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(FindFlowerCommand.class.getName());

    @Override
    public void execute(Bouquet bouquet) {
        LOGGER.log(Level.FINE, "execute()");
        search(bouquet);
    }

    private void search(Bouquet bouquet) {
        LOGGER.log(Level.FINE, "search()");
        try {
            System.out.println("Enter the stem length range : ");
            Scanner in = new Scanner(System.in);

            System.out.println("from - ");
            int lengthA = in.nextInt();

            System.out.println("up to - ");
            int lengthB = in.nextInt();

            if (lengthA < 0 || lengthB < 0) {
                System.out.println("\nLength cannot be less than zero");
            }
            else if (lengthB < lengthA) {
                System.out.println("Range input error!!!");
            }

            bouquet.searchFlower(lengthA, lengthB);
        }
        catch (InputMismatchException ex) {
            LOGGER.log(Level.SEVERE, ex.toString(), ex);
            System.out.println("Bad input!!!!");
        }
    }
}
