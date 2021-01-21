package Credits.Model.Credit.Type;

import Credits.Model.Credit.Credit;
import Credits.Settings.Bank;

public class Mortgage extends Credit {
    public Mortgage(double rate, double minSum, double duration, Bank bank, boolean possibilityOfLineIncrease, boolean possibilityOfEarlyRepayment) {
        super("Mortgage", rate, minSum, duration, bank, possibilityOfLineIncrease, possibilityOfEarlyRepayment);
    }
}