package Florist.Menu.Commands;

import Florist.Model.Bouquet;
import Florist.Model.Flower.Flower;
import Florist.Model.Flower.Type.Carnation;
import Florist.Model.Flower.Type.Iris;
import Florist.Model.Flower.Type.Rose;
import Florist.Model.Flower.Type.Tulip;
import Florist.Settings.FlowerFreshness;

import java.util.Scanner;

public class AddFlowerCommand implements Command {
    @Override
    public void execute(Bouquet bouquet) {
        bouquet.addFlower(createFlower());
    }

    private Flower createFlower() {
        System.out.println("Select flower to add to the bouquet");
        showFlowers();
        Flower flower;
        switch(getFlower()) {
            case 1: flower = new Rose(10, FlowerFreshness.FRESH, 10); break;
            case 2: flower = new Carnation(10, FlowerFreshness.FRESH, 10); break;
            case 3: flower = new Iris(10, FlowerFreshness.FRESH, 10); break;
            default: flower = new Tulip(10, FlowerFreshness.FRESH, 10);
        }

        return flower;
    }

    private void showFlowers() {
        System.out.println("1 - Rose\n" +
            "2 - Carnation\n" +
            "3 - Iris\n" +
            "4 - Tulip");
    }

    private int getFlower() {
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
