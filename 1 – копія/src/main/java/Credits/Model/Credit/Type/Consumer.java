package Credits.Model.Credit.Type;

import Credits.Model.Credit.Credit;
import Credits.Settings.Bank;

public class Consumer extends Credit {
    public Consumer(double rate, double minSum, double duration, Bank bank, boolean possibilityOfLineIncrease, boolean possibilityOfEarlyRepayment) {
        super("Consumer", rate, minSum, duration, bank, possibilityOfLineIncrease, possibilityOfEarlyRepayment);
    }
}
