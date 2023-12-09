package ru.netology.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void testRemainMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int actual = service.remain(amount);
        int expected = 600;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void testRemainBelow1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}