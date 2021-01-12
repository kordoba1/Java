package Florist.Menu.Commands;

import Florist.Model.Bouquet;

public class SortFlowersCommand implements Command {
    @Override
    public void execute(Bouquet bouquet) {
        bouquet.sortFlowers();
    }

}