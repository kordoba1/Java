package game.controller.arena.type;

import game.controller.arena.Arena;
import game.model.Droid;

import java.util.Random;

public class BattleArena extends Arena {

    private final Droid firstDroid;
    private final Droid secondDroid;
    private Droid assaulter;
    private Droid target;

    public BattleArena(Droid firstDroid, Droid secondDroid) {
        this.firstDroid = firstDroid;
        this.secondDroid = secondDroid;
    }

    @Override
    public String startBattle() {

        int round = 1;

        do {
            printRoundInformation(round);
            setOpponents();

            int damage = assaulter.getDamage();
            target.getHit(damage);

            System.out.println(target.getName() + " was hit by " + assaulter.getName() + " with damage=" + damage);
            round++;
        } while (target.isAlive());

        return assaulter.getName();
    }

    @Override
    protected void printRoundInformation(int round) {
        System.out.println("_____________________");
        System.out.println("Round " + round);
    }

    @Override
    protected void setOpponents() {
        if (new Random().nextBoolean()) {
            assaulter = firstDroid;
            target = secondDroid;
        } else {
            assaulter = secondDroid;
            target = firstDroid;
        }
    }
}
