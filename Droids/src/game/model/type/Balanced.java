package game.model.type;

import game.model.Droid;

public class Balanced extends Droid {

    public Balanced(String name)
    {
        super(name);
        health = 100;
        damage = 20;
    }
}
