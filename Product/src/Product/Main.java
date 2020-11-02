package Product;

import Product.Description.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList CreateList() {

        ArrayList<Product> ProductList = new ArrayList<Product>();
        Scanner myObj = new Scanner(System.in);
        int exit = 1;
        while (exit != 0)
        {
            Product temp = Input(myObj);
            ProductList.add(temp);

            System.out.print("enter 0 to exit: ");
            exit = myObj.nextInt();
        }
        return ProductList;
    }

    static Product Input(Scanner myObj) {
        System.out.print("id: ");
        int id = myObj.nextInt();myObj.nextLine();
        System.out.print("name: ");
        String name = myObj.nextLine();
        System.out.print("manufacturer: ");
        String manufacturer = myObj.nextLine();
        System.out.print("price: ");
        double price = myObj.nextDouble();
        System.out.print("lifetime: ");
        int lifetime = myObj.nextInt();
        System.out.print("count: ");
        int count = myObj.nextInt();

        return new Product(id, name, manufacturer, price, lifetime, count);
    }

    static void ShowByName(ArrayList<Product> ProductList, String name) {
        System.out.println("Records with name " + name);
        for (int i = 0; i < ProductList.size(); i++)
            if (ProductList.get(i).getName().equals(name))
                System.out.println(ProductList.get(i));
    }

    static void ShowWhereLifeMoreThan(ArrayList<Product> ProductList, int lifetime) {
        System.out.println("Records with lifetime more than " + lifetime);
        for (int i = 0; i < ProductList.size(); i++)
            if (ProductList.get(i).getLifetime() > lifetime)
                System.out.println(ProductList.get(i));
    }

    static void ShowByNamePrice(ArrayList<Product> ProductList, String name, double price) {
        System.out.println("Records with name " + name + " and price lower then " + price);
        for (int i = 0; i < ProductList.size(); i++)
            if (ProductList.get(i).getName().equals(name) && ProductList.get(i).getPrice() <= price)
                System.out.println(ProductList.get(i));
    }

    static void ShowAll(ArrayList<Product> ProductList) {
        System.out.println("All records:");
        for (int i = 0; i < ProductList.size(); i++)
            System.out.println(ProductList.get(i));
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        ArrayList<Product> ProductList = CreateList();
        ShowAll(ProductList);

        System.out.print("Enter name to find records: ");
        String NameToFind = myObj.nextLine();
        ShowByName(ProductList, NameToFind);

        System.out.print("Enter lifetime to find records where time more than: ");
        int lifetimeToFind = myObj.nextInt();
        ShowWhereLifeMoreThan(ProductList, lifetimeToFind);

        myObj.nextLine();
        System.out.print("Enter name to find records: ");
        NameToFind = myObj.nextLine();
        System.out.print("Enter lifetime to find records where time more than: ");
        double priceToFind = myObj.nextInt();
        ShowByNamePrice(ProductList, NameToFind, priceToFind);
    }
}
