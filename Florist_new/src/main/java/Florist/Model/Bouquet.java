package Florist.Model;

import Florist.Model.Accessories.Accessories;
import Florist.Model.Flower.Flower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bouquet {
    private static final Logger LOGGER = Logger.getLogger(Bouquet.class.getName());
    private final ArrayList<Flower> flowersList;
    private final ArrayList<Accessories> accessoriesList;

    public Bouquet() {
        flowersList = new ArrayList<>();
        accessoriesList = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowersList.add(flower);
    }

    public void addAccessory(Accessories accessory) {
        accessoriesList.add(accessory);
    }

    public void sortFlowers() {
        flowersList.sort(Comparator.comparing(Flower::getFreshness));
    }

    public void searchFlower(int lengthA, int lengthB) {
        LOGGER.log(Level.FINE, "searchFlower()");
        int count = 0;

        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = lengthA; i < lengthB; i++) {
            tempList.add(i);
        }
        for (Flower item : flowersList) {
            for (int j : tempList) {
                if (item.getLengthOfStem() == j) {
                    System.out.println(item.getName() + " - length of stem " + item.getLengthOfStem());
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("There are no such flowers!");
        }
    }

    public void showBouquet() {
        System.out.println("Bouquet made with:");
        for (Flower flower : flowersList) {
            System.out.println(flower);
        }
        for (Accessories item : accessoriesList) {
            System.out.println(item);
        }
        System.out.println("Bouquet price: " + getPrice());
    }

    public double getPrice() {
        double price = 0;
        for (Flower item : flowersList) {
            price += item.getPrice();
        }
        for (Accessories item : accessoriesList) {
            price += item.getPrice();
        }
        LOGGER.log(Level.FINE, "getPrice() returned %lf ", price);
        return price;
    }

    public ArrayList<Flower> getFlowersList() {
        return flowersList;
    }

    public ArrayList<Accessories> getAccessoriesList() {
        return accessoriesList;
    }
}
