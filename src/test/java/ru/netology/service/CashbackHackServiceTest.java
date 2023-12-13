package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Test;

class CashbackHackServiceTest {
    @org.junit.Test
    void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    void testRemainMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int actual = service.remain(amount);
        int expected = 600;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    void testRemainBelow1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
}