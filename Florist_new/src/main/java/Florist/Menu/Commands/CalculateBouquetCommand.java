package Florist.Menu.Commands;

import Florist.Model.Bouquet;

public class CalculateBouquetCommand implements Command {
    @Override
    public void execute(Bouquet bouquet) {
        System.out.println("Bouquet price is " + bouquet.getPrice());
    }
}
