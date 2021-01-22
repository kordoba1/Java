package game.controller.arena.type;

import game.controller.arena.Arena;
import game.controller.factory.DroidTeam;
import game.model.Droid;

import java.util.Random;

public class TeamArena extends Arena {
    private DroidTeam teamA;
    private DroidTeam teamB;
    private DroidTeam teamAssaulter;
    private DroidTeam teamTarget;

    public TeamArena(DroidTeam teamA, DroidTeam teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public String startBattle() {
        int round = 1;
        do {
            printRoundInformation(round++);
            setOpponents();
            Droid assaulter = teamAssaulter.getRandomDroid();
            Droid target = teamTarget.getRandomDroid();

            target.getHit(assaulter.getDamage());
            if (!target.isAlive()) {
                teamTarget.removeDroid(target);
            }
            System.out.println(target.getName() + " from " + teamTarget.getName() + " was hit by " +
                assaulter.getName() + " from " + teamAssaulter.getName() + " with damage=" + assaulter.getDamage());
        } while (teamTarget.isAnyoneAlive());

        return teamAssaulter.getName();
    }

    @Override
    protected void setOpponents() {
        if (new Random().nextBoolean()) {
            teamAssaulter = teamA;
            teamTarget = teamB;
        } else {
            teamAssaulter = teamB;
            teamTarget = teamA;
        }
    }

    @Override
    protected void printRoundInformation(int round) {
        System.out.println("_____________________");
        System.out.println("Round " + round);
    }
}
