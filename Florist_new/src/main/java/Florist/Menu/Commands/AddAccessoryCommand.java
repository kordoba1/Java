package Florist.Menu.Commands;

import Florist.Model.Accessories.Accessories;
import Florist.Model.Accessories.Type.Paper;
import Florist.Model.Accessories.Type.Tape;
import Florist.Model.Bouquet;
import Florist.Settings.AccessoriesColor;
import java.util.Scanner;

//public class AddAccessoryCommand extend Abstreact implements Command
public class AddAccessoryCommand implements Command {
    @Override
    public void execute(Bouquet bouquet) {
        bouquet.addAccessory(createAccessory());
    }

    private Accessories createAccessory() {
        System.out.println("Select flower to add to the bouquet");
        showAccessories();
        Accessories accessory;
        if (getAccessory() == 1) {
            accessory = new Paper(AccessoriesColor.BLUE, 10);
        } else {
            accessory = new Tape(AccessoriesColor.BLUE, 10);
        }
        return accessory;
    }

    private void showAccessories() {
        System.out.println("1 - Paper\n" +
                "2 - Tape");
    }

    private int getAccessory() {
        int flower;
        Scanner in = new Scanner(System.in);
        do {
            System.out.format("choose menu item -> ");
            flower = in.nextInt();
        } while(flower < 1 ||
                2 < flower);

        return flower;
    }
}