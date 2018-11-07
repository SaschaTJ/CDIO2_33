package test;

import org.junit.jupiter.api.Test;
import spil.Account;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    void addToScore() {
        Account test = new Account();
        test.addToScore(-5000);
        assertEquals(0,test.getScore());

        Account test1 = new Account();
        test1.addToScore(5000);
        assertEquals(3000,test1.getScore());

    }

    @Test
    void getScore() {
    }
}