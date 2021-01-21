package game.process;

import game.controller.arena.type.BattleArena;
import game.controller.arena.type.TeamArena;
import game.controller.factory.DroidTeam;
import game.model.Droid;

import java.util.ArrayList;
import java.util.Scanner;

import static game.process.Printer.showDroids;

public class FightPreparation {
    FightPreparation() {}

    public TeamArena prepareTeamFight(ArrayList<Droid> droids) {
        DroidTeam droidTeamA = new DroidTeam("team A");
        int firstPart = droids.size() / 2;
        for (int i = 0; i < firstPart; i++)
            droidTeamA.addDroid(droids.get(i));

        DroidTeam droidTeamB = new DroidTeam("team B");
        for (int i = firstPart; i < droids.size(); i++)
            droidTeamB.addDroid(droids.get(i));

        return new TeamArena(droidTeamA, droidTeamB);
    }

    public BattleArena prepareSingleFight(ArrayList<Droid> droids) {

        System.out.println("please choose two Droids to fight");
        showDroids(droids);

        Scanner in = new Scanner(System.in);
        int first;
        int second;

        while (true) {
            first = in.nextInt();
            second = in.nextInt();

            if (first > 0 && second > 0 && first <= droids.size() && second <= droids.size() && first != second) {
               break;
            }
            System.out.println("entered Droid does not exist");
        }
        return new BattleArena(droids.get(first), droids.get(second));
    }
}
