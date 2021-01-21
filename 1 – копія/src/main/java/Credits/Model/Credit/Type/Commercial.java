package Credits.Model.Credit.Type;

import Credits.Model.Credit.Credit;
import Credits.Settings.Bank;

public class Commercial extends Credit {
    public Commercial(double rate, double minSum, double duration, Bank bank, boolean possibilityOfLineIncrease, boolean possibilityOfEarlyRepayment) {
        super("Commercial", rate, minSum, duration, bank, possibilityOfLineIncrease, possibilityOfEarlyRepayment);
    }
}
