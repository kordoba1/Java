package Credits.Settings;

public enum CommandName {

    CHOOSE_CREDIT_COMMAND("ChooseCreditCommand"),
    SHOW_CHOSEN_CREDIT_COMMAND("ShowChosenCreditCommand"),
    SHOW_AVAILABLE_CREDITS_COMMAND("ShowAvailableCreditsCommand"),
    INCREASE_CREDIT_LINE_COMMAND("IncreaseCreditLineCommand"),
    SEARCH_CREDIT_BY_CRITERIA_COMMAND("SearchCreditByCriteriaCommand"),
    MAKE_EARLY_REPAYMENT_COMMAND("MakeEarlyRepaymentCommand");

    private final String name;

    public String getName() {
        return name;
    }
    CommandName(String name) {
        this.name = name;
    }

}
