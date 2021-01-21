package game.model.type;

import game.model.Droid;

public class Tank extends Droid {

    public Tank(String name)
    {
        super(name);
        health = 150;
        damage = 15;
    }
}
