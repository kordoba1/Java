package Florist.Menu.Commands;

import Florist.Model.Bouquet;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowBouquetCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(ShowBouquetCommand.class.getName());

    @Override
    public void execute(Bouquet bouquet) {
       LOGGER.log(Level.FINE, "execute()");
       bouquet.showBouquet();
    }
}