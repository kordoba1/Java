package Florist.Menu.Commands;

import Florist.Model.Bouquet;

public class ShowBouquetCommand implements Command {
    @Override
    public void execute(Bouquet bouquet) {
       bouquet.showBouquet();
    }
}