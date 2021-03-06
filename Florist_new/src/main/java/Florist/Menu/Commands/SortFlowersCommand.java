package Florist.Menu.Commands;

import Florist.Model.Bouquet;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SortFlowersCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger( SortFlowersCommand.class.getName() );

    @Override
    public void execute(Bouquet bouquet) {
        LOGGER.log(Level.FINE, "execute()");
        bouquet.sortFlowers();
    }

}