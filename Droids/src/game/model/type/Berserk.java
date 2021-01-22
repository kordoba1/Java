package game.model.type;

import game.model.Droid;

public class Berserk extends Droid {

    public Berserk(String name)
    {
        super(name);
        health = 70;
        damage = 25;
    }
}
