package game.controller.factory;

import game.model.Droid;
import game.model.type.*;

import java.util.Random;

public class DroidFactory {
    private final static int nameLength = 5;

    private String getRandomName(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        String name = "";
        for(int i = 0; i < length; i++) {
            name += characters.charAt(new Random().nextInt(characters.length()));
        }

        return name;
    }


    public Droid createDroid() {
        Droid droid;
        switch(new Random().nextInt(3)) {
            case 0: droid = new Berserk(getRandomName(nameLength)); break;
            case 1: droid = new Tank(getRandomName(nameLength)); break;
            default: droid = new Balanced(getRandomName(nameLength)); break;
        }

        return droid;
    }
}
