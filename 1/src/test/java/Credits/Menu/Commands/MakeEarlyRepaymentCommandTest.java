package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;
import Credits.Model.Credit.Type.Consumer;
import org.junit.jupiter.api.Test;

class MakeEarlyRepaymentCommandTest {

    @Test
    void successfulEarlyRepayment() {
        Credit credit = new Consumer(17.2, 1000000, 240, Bank.PRIVAT, false, true);
        Client client = new Client("Vasya", "Pupkin", 1500000);
        client.chooseCredit(credit);
        client.makeEarlyRepayment(1000000);
        assertEquals(500000, client.getMoney());
    }

    @Test
    void unsuccessfulEarlyRepayment() {
        Credit credit = new Consumer(17.2, 1000000, 240, Bank.PRIVAT, false, false);
        Client client = new Client("Vasya", "Pupkin", 1500000);
        client.chooseCredit(credit);
        client.makeEarlyRepayment(1000000);
        assertEquals(1500000, client.getMoney());
    }
}