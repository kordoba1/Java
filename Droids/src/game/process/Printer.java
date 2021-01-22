package game.process;

import game.model.Droid;

import java.util.ArrayList;

public class Printer {
    public static void showDroids(ArrayList<Droid> droids) {
        System.out.println("---------created Droids---------");
        for (int i = 0; i < droids.size(); i++) {
            System.out.format("%2d) ", i);
            System.out.println(droids.get(i));
        }
        System.out.println("--------------------------------");
    }
}
