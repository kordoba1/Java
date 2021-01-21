package Florist.Menu.Commands.AddCmd;

import Florist.Menu.Commands.AddCommand;
import Florist.Model.Bouquet;
import Florist.Model.Flower.Flower;
import Florist.Model.Flower.Type.Carnation;
import Florist.Model.Flower.Type.Iris;
import Florist.Model.Flower.Type.Rose;
import Florist.Model.Flower.Type.Tulip;
import Florist.Settings.FlowerFreshness;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddFlowerCommand extends AddCommand {
    private static final Logger LOGGER = Logger.getLogger(AddFlowerCommand.class.getName());

    @Override
    public void execute(Bouquet bouquet) {
        LOGGER.log(Level.FINE, "execute()");
        bouquet.addFlower(createFlower());
    }

    private Flower createFlower() {
        LOGGER.log(Level.FINE, "createFlower()");
        System.out.println("Select flower to add to the bouquet");
        show();
        Flower flower;
        switch(get()) {
            case 1: flower = new Rose(10, FlowerFreshness.FRESH, 10); break;
            case 2: flower = new Carnation(10, FlowerFreshness.FRESH, 10); break;
            case 3: flower = new Iris(10, FlowerFreshness.FRESH, 10); break;
            default: flower = new Tulip(10, FlowerFreshness.FRESH, 10);
        }

        return flower;
    }

    protected void show() {
        System.out.println("1 - Rose\n" +
            "2 - Carnation\n" +
            "3 - Iris\n" +
            "4 - Tulip");
    }

    protected int get() {
        LOGGER.log(Level.FINE, "getFlower()");
        int flower;
        Scanner in = new Scanner(System.in);
        do {
            System.out.format("choose menu item -> ");
            flower = in.nextInt();
        } while(flower < 1 ||
                4 < flower);

        return flower;
    }
}
