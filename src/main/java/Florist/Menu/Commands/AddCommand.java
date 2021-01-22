package Florist.Menu.Commands;

import Florist.Model.Bouquet;

public abstract class AddCommand implements Command {

    @Override
    public abstract void execute(Bouquet bouquet);

    protected abstract void show();

    protected abstract int get();
}
