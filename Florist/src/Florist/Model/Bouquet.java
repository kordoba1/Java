package Florist.Model;

import Florist.Model.Accessories.Accessories;
import Florist.Model.Flower.Flower;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> bouquetList;
    private ArrayList<Accessories> accessoriesList;

    public Bouquet() {
        bouquetList = new ArrayList<>();
        accessoriesList = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        bouquetList.add(flower);
    }

    public void addAccessory(Accessories accessory) {
        accessoriesList.add(accessory);
    }

    public void sortFlowers() {
        bouquetList.sort((f1, f2) -> f1.getFreshness().compareTo(f2.getFreshness()));
    }

    public void searchFlower(int lengthA, int lengthB) {
        int count = 0;

        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = lengthA; i < lengthB; i++) {
            tempList.add(i);
        }
        for (Flower item : bouquetList) {
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
        for (Flower flower : bouquetList) {
            System.out.println(flower);
        }
        for (Accessories item : accessoriesList) {
            System.out.println(item);
        }
        System.out.println("Bouquet price: " + getPrice());
    }

    private double getPrice() {
        double price = 0;
        for (Flower item : bouquetList) {
            price += item.getPrice();
        }
        for (Accessories item : accessoriesList) {
            price += item.getPrice();
        }
        return price;
    }
}
