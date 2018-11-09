package test;

import org.junit.jupiter.api.Test;
import spil.Account;

import static org.junit.jupiter.api.Assertions.*;

/** @Author Andreas
 * The first test "Account test" tests if the balance can be negative.
 * The second test "Account test1" tests that the balance can never get over 3000.
 */

class AccountTest {

    @Test
    void addToScore() {
        Account test = new Account();
        test.addToScore(-5000);
        assertEquals(0,test.getScore());

        System.out.println("Result for Account test = " + test.getScore());

        Account test1 = new Account();
        test1.addToScore(5000);
        assertEquals(3000,test1.getScore());

        System.out.println("Result for Account test1 = " + test1.getScore());

    }

}