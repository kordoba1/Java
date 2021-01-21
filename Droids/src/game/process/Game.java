package game.process;

import game.controller.factory.DroidFactory;
import game.model.Droid;
import game.process.MenuItem;

import java.util.ArrayList;
import java.util.Scanner;

import static game.process.MenuItem.ADD_ITEM;
import static game.process.Printer.showDroids;

public class Game {
    private ArrayList<Droid> droids;

    public Game() {
        droids = new ArrayList<>();
    }

    public void start() {
        boolean quit = false;
        while (!quit)
        {
            collectGarbage();
            switch (getMenuItem()) {
                case ADD_ITEM: {
                    droids.add(new DroidFactory().createDroid());
                    break;
                }
                case SHOW_ITEM: {
                    showDroids(droids);
                    break;
                }
                case SINGLE_ITEM: {
                    singleFight();
                    break;
                }
                case TEAM_ITEM: {
                    teamFight();
                    break;
                }
                case QUIT_ITEM: {
                    quit = true;
                    break;
                }
            }
        }
    }

    private void mainMenu() {
        System.out.println("\n-----------MENU-----------");
        System.out.println("1 - create Droid");
        System.out.println("2 - show created Droids");
        System.out.println("3 - start Droid fight 1x1");
        System.out.println("4 - start Droid team fight");
        System.out.println("5 - quit");
        System.out.println("--------------------------");
    }

    private MenuItem getMenuItem() {
        int item;
        Scanner in = new Scanner(System.in);
        do {
            mainMenu();
            System.out.format("choose menu item -> ");
            item = in.nextInt();
        } while(item < MenuItem.LOWER_LIMIT.getPoint() || MenuItem.UPPER_LIMIT.getPoint() < item);

        return MenuItem.values()[item];
    }

    private void singleFight() {
        if (!areEnoughDroids()) {
            return;
        }

        String winner = new FightPreparation().prepareSingleFight(droids).startBattle();

        System.out.println("The winner is " + winner);
    }

    private void teamFight() {
        if (!areEnoughDroids()) {
            return;
        }
        String winner = new FightPreparation().prepareTeamFight(droids).startBattle();

        System.out.println("The winner is " + winner);
    }

    private void collectGarbage() {
        for (int i = 0; i < droids.size(); ) {
            if (!droids.get(i).isAlive()) {
                droids.remove(i);
            }
            else {
                i++;
            }
        }
    }

    private boolean areEnoughDroids()
    {
        if (droids.size() < 2) {
            System.out.println("there are not enough available Droids");
            return false;
        }

        return true;
    }
}
