package Credits.Menu.Commands;

import Credits.Model.Client;
import Credits.Model.Credit.Credit;
import Credits.Model.Credit.Type.Commercial;
import Credits.Model.Credit.Type.Consumer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChooseCreditCommandTest {

    @Test
    void successfulChooseCreditTest() {
        Credit credit = new Consumer(17.2, 1000000, 240, Bank.PRIVAT, false, true);
        Client client = new Client("Vasya", "Pupkin", 1500000);
        client.chooseCredit(credit);
        assertSame(client.getCredit(), credit);
    }

    @Test
    void unSuccessfulChooseCreditTest() {
        Credit credit = new Consumer(17.2, 1000000, 240, Bank.PRIVAT, false, true);
        Credit credit2 = new Commercial(12.2, 3200100, 240, Bank.PRIVAT, false, true);
        Client client = new Client("Vasya", "Pupkin", 1500000);
        client.chooseCredit(credit);
        assertNotSame(client.getCredit(), credit2);
    }
}