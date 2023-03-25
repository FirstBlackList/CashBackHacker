package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @org.junit.jupiter.api.Test
    public void testRemainReturn100WhenDepositingTo900APIJUnitJupiter() {
        assertEquals(100, service.remain(900));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn450WhenDepositingTo550APIJUnitJupiter() {
        assertEquals(450, service.remain(550));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn999WhenDepositingTo1APIJUnitJupiter() {
        assertEquals(999, service.remain(1));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn999WhenDepositingTo1001APIJUnitJupiter() {
        assertEquals(999, service.remain(1001));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn1WhenDepositingTo999APIJUnitJupiter() {
        assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn1WhenDepositingTo1999APIJUnitJupiter() {
        assertEquals(1, service.remain(1999));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn1000WhenDepositingTo0APIJUnitJupiter() {
        assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn0WhenDepositingTo1000APIJUnitJupiter() {
        assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void testRemainReturn0WhenDepositingTo2000APIJUnitJupiter() {
        assertEquals(0, service.remain(2000));
    }
}