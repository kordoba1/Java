package Credits.Settings;

public enum MenuItemName {

    CHOOSE_CREDIT_ITEM("1 - choose credit\n"),
    SHOW_CHOSEN_CREDIT_ITEM("2 - show chosen credit\n"),
    SHOW_AVAILABLE_CREDITS_ITEM("3 - show available credits\n"),
    INCREASE_CREDIT_LINE_ITEM("4 - increase credit line\n"),
    SEARCH_CREDIT_BY_CRITERIA_ITEM("5 - search credit by criteria\n"),
    MAKE_EARLY_REPAYMENT_ITEM("6 - make early repayment\n"),
    EXIT("7 - exit\n");

    private final String name;

    public String getName() {
        return name;
    }

    MenuItemName(String name) {
        this.name = name;
    }
}
