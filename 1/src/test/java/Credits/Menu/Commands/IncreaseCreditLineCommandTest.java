package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;
import Credits.Model.Credit.Type.Consumer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncreaseCreditLineCommandTest {

    @Test
    void successfulLineIncrease() {
        Credit credit = new Consumer(17.2, 1000000, 240, Bank.PRIVAT, true, true);
        Client client = new Client("Vasya", "Pupkin", 1500000);
        client.chooseCredit(credit);
        client.getCredit().increaseCreditLine(12);
        assertEquals(252, client.getCredit().getDuration());
    }

    @Test
    void unsuccessfulLineIncrease() {
        Credit credit = new Consumer(17.2, 1000000, 240, Bank.PRIVAT, false, false);
        Client client = new Client("Vasya", "Pupkin", 1500000);
        client.chooseCredit(credit);
        client.getCredit().increaseCreditLine(12);
        assertEquals(240, client.getCredit().getDuration());
    }
}