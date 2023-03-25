package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainReturn100WhenDepositingTo900() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void testRemainReturn450WhenDepositingTo550() {
        assertEquals(450, service.remain(550));
    }

    @Test
    public void testRemainReturn999WhenDepositingTo1() {
        assertEquals(999, service.remain(1));
    }

    @Test
    public void testRemainReturn999WhenDepositingTo1001() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void testRemainReturn1WhenDepositingTo999() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void testRemainReturn1WhenDepositingTo1999() {
        assertEquals(1, service.remain(1999));
    }

    @Test
    public void testRemainReturn1000WhenDepositingTo0() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void testRemainReturn0WhenDepositingTo1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemainReturn0WhenDepositingTo2000() {
        assertEquals(0, service.remain(2000));
    }
}