package Florist.Menu.Commands;

import Florist.Model.Bouquet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindFlowerCommand implements Command {
    @Override
    public void execute(Bouquet bouquet) {
        search(bouquet);
    }

    private void search(Bouquet bouquet) {
        try {
            System.out.println("Enter the stem length range : ");
            Scanner in = new Scanner(System.in);

            System.out.println("from - ");
            int lengthA = in.nextInt();

            System.out.println("up to - ");
            int lengthB = in.nextInt();

            if (lengthA < 0 || lengthB < 0) {
                System.out.println("\nLength cannot be less than zero");
            }
            else if (lengthB < lengthA) {
                System.out.println("Range input error!!!");
            }

            bouquet.searchFlower(lengthA, lengthB);
        }
        catch (InputMismatchException e) {
            System.out.println("Bad input!!!!");
        }
    }
}
