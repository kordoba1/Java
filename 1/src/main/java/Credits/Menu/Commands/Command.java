package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit;

import java.util.ArrayList;

public interface Command {
    void execute(ArrayList<Credit> credit, Client client);
}
