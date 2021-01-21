package Credits.Model.Credit;

import Credits.Settings.Bank;

public abstract class Credit {
    private final String name;
    private final double rate;
    private final double minSum;
    private double duration;
    private final Bank bank;
    private final boolean possibilityOfLineIncrease;
    private final boolean possibilityOfEarlyRepayment;

    public Credit(String name, double rate, double minSum, double duration, Bank bank, boolean possibilityOfLineIncrease, boolean possibilityOfEarlyRepayment) {
        this.name = name;
        this.rate = rate;
        this.minSum = minSum;
        this.duration = duration;
        this.bank = bank;
        this.possibilityOfLineIncrease = possibilityOfLineIncrease;
        this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getMinSum() {
        return minSum;
    }

    public double getDuration() {
        return duration;
    }

    public Bank getBank() {
        return bank;
    }

    public boolean isPossibilityOfLineIncrease() {
        return possibilityOfLineIncrease;
    }

    public boolean isPossibilityOfEarlyRepayment() {
        return possibilityOfEarlyRepayment;
    }

    public void increaseCreditLine(int duration) {
        if (possibilityOfLineIncrease)
            this.duration += duration;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", minSum=" + minSum +
                ", duration=" + duration +
                ", bank=" + bank +
                ", possibilityOfLineIncrease=" + possibilityOfLineIncrease +
                ", possibilityOfEarlyRepayment=" + possibilityOfEarlyRepayment +
                '}';
    }
}
