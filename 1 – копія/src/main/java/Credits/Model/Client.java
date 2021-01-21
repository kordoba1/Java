package Credits.Model;

import Credits.Model.Credit.Credit;

public class Client {
    private final String firstName;
    private final String lastName;
    private double money;
    private Credit credit;

    public Client(String firstName, String lastName, double money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMoney() {
        return money;
    }

    public Credit getCredit() {
        return credit;
    }


    public void chooseCredit(Credit credit) {
        this.credit = credit;
    }

    public void makeEarlyRepayment(int money) {
        if (credit.isPossibilityOfEarlyRepayment())
            this.money -= money;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                ", credit=" + credit +
                '}';
    }
}
