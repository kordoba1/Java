package Florist.Menu.Commands.AddCmd;

import Florist.Menu.Commands.AddCommand;
import Florist.Model.Accessories.Accessories;
import Florist.Model.Accessories.Type.Paper;
import Florist.Model.Accessories.Type.Tape;
import Florist.Model.Bouquet;
import Florist.Settings.AccessoriesColor;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddAccessoryCommand extends AddCommand {
    private static final Logger LOGGER = Logger.getLogger(AddAccessoryCommand.class.getName());
    @Override
    public void execute(Bouquet bouquet) {
        LOGGER.log(Level.FINE, "execute()");
        bouquet.addAccessory(createAccessory());
    }

    private Accessories createAccessory() {
        LOGGER.log(Level.FINE, "createAccessory()");

        System.out.println("Select flower to add to the bouquet");
        show();
        Accessories accessory;
        if (get() == 1) {
            accessory = new Paper(AccessoriesColor.BLUE, 10);
        } else {
            accessory = new Tape(AccessoriesColor.BLUE, 10);
        }
        return accessory;
    }

    protected void show() {
        System.out.println("1 - Paper\n" +
                "2 - Tape");
    }

    protected int get() {
        LOGGER.log(Level.FINE, "getAccessory()");
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