package Credits.Settings;

public enum MenuItem {
    LOWER_LIMIT(1),
    CHOOSE_CREDIT(1),
    SHOW_CHOSEN(2),
    SHOW_AVAILABLE(3),
    INCREASE_CREDIT_LINE(4),
    SEARCH_CREDIT_BY_CRITERIA(5),
    MAKE_EARLY_REPAYMENT(6),
    EXIT(7),
    UPPER_LIMIT(7);

    private final int value;

    MenuItem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
