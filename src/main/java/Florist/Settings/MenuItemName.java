package Florist.Settings;

public enum  MenuItemName {

    ADD_FLOWER_ITEM("1 - add a flower to the bouquet\n"),
    ADD_ACCESSORY_ITEM("2 - add a accessory to the bouquet\n"),
    SORT_FLOWER_ITEM("3 - sort flowers in the bouquet by freshness\n"),
    FIND_FLOWER_ITEM("4 - find flower in range of stem length\n"),
    SHOW_BOUQUET_ITEM("5 - show bouquet\n"),
    CALCULATE_BOUQUET_ITEM("6 - get bouquet price\n"),
    EXIT("7 - exit\n");

    private final String name;

    public String getName() {
        return name;
    }

    MenuItemName(String name) {
        this.name = name;
    }
}
