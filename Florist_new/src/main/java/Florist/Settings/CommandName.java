package Florist.Settings;

public enum CommandName {

    ADD_FLOWER_COMMAND("AddFlowerCommand"),
    ADD_ACCESSORY_COMMAND("AddAccessoryCommand"),
    SORT_FLOWER_COMMAND("SortFlowersCommand"),
    FIND_FLOWER_COMMAND("FindFlowerCommand"),
    SHOW_BOUQUET_COMMAND("ShowBouquetCommand"),
    CALCULATE_BOUQUET_COMMAND("CalculateBouquetCommand");

    private final String name;

    public String getName() {
        return name;
    }
    CommandName(String name) {
        this.name = name;
    }

}
