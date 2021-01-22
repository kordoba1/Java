package Florist.Menu.Commands;

import Florist.Model.Bouquet;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculateBouquetCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger( CalculateBouquetCommand.class.getName() );

    @Override
    public void execute(Bouquet bouquet) {
        LOGGER.log(Level.FINE, "execute()");
        System.out.println("Bouquet price is " + bouquet.getPrice());
    }
}
