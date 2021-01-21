package Florist.Menu.Commands;

import Florist.Model.Accessories.Accessories;
import Florist.Model.Accessories.Type.Paper;
import Florist.Model.Accessories.Type.Tape;
import Florist.Model.Bouquet;
import Florist.Settings.AccessoriesColor;
import java.util.Scanner;

public class AddAccessoryCommand implements Command {
    @Override
    public void execute(Bouquet bouquet) {
        bouquet.addAccessory(createAccessory());
    }

    private Accessories createAccessory() {
        System.out.println("Select flower to add to the bouquet");
        showFlowers();
        Accessories accessory;
        if (getFlower() == 1) {
            accessory = new Paper(AccessoriesColor.BLUE, 10);
        } else {
            accessory = new Tape(AccessoriesColor.BLUE, 10);
        }

        return accessory;
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