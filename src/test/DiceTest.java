package test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import spil.Dice;

/** @Aurthor Peter
 * The test caunts the amount of each dicesum from 2-12.
 */

        class DiceTest {

            @org.junit.jupiter.api.Test
            void throwDice() {

                Dice test = new Dice();
                Dice test2 = new Dice();


                // We creates an Array at 13 insted of 11 to match the dicesum with the number of arrays.
                int[] arr = new int[13];


                // The Dice are thrown 10.000 times.

                for (int i = 0; i < 10000; i++) {
                    test.throwDice();
                    test2.throwDice();
                    arr[test.getEyes()+test2.getEyes()]++;

                }
                for(int i : arr) {
                    System.out.println(i);
                }



                //The test is compared with the realistic probability for each dicesum, our deviation is 20%.


                assertEquals(0, arr[1]);
                assertEquals(278, arr[2], 56);
                assertEquals(556, arr[3], 112);
                assertEquals(833, arr[4], 166);
                assertEquals(1011, arr[5], 222);
                assertEquals(1389, arr[6], 278);
                assertEquals( 1667, arr[7], 334);
                assertEquals(1389, arr[8], 278);
                assertEquals(1011, arr[9], 222);
                assertEquals(833, arr[10], 166);
                assertEquals(556, arr[11], 112);
                assertEquals(278, arr[12], 56);
            }

}

//Source: Studiegruppe 33, DTU 2018: CDIO del 1.

