package Florist.Settings;

public enum MenuItem {
    LOWER_LIMIT(1),
    ADD_FLOWER(1),
    ADD_ACCESSORY(2),
    SORT(3),
    FIND(4),
    SHOW(5),
    EXIT(6),
    UPPER_LIMIT(6);

    private final int value;

    MenuItem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
