package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ShowAvailableCreditsCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger( ShowAvailableCreditsCommand.class.getName() );

    @Override
    public void execute(ArrayList<Credit> credits, Client client) {

    }
}
