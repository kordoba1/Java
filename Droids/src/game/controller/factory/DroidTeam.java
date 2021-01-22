package game.controller.factory;

import game.model.Droid;
import java.util.ArrayList;
import java.util.Random;

public class DroidTeam {
    private ArrayList<Droid> team;
    private String name;

    public DroidTeam(String name) {
        this.name = name;
        team = new ArrayList<>();
    }

    public void addDroid(Droid droid) {
        team.add(droid);
    }

    public void removeDroid(Droid droid) {
        team.remove(droid);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Droid getRandomDroid() {
        return team.get(new Random().nextInt(team.size()));
    }

    public boolean isAnyoneAlive() {
        return team.size() != 0;
    }
}
