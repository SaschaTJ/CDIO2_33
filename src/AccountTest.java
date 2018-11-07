import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    void addToScore() {
        Account test = new Account();
        test.addToScore(-5000);
        assertEquals(0,test.getScore());


    }

    @Test
    void getScore() {
    }
}