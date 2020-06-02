package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int expected = 21;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        int expected = 19;
        int actual = conditioner.getCurrentTemperature();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(24);
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        int expected = 25;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNameReturn() {
        Conditioner conditioner = new Conditioner();
        String expected = "LG";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldMaxTemperatureReturn() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        int expected =25;
        int actual = conditioner.getMaxTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinTemperatureReturn() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        int expected =15;
        int actual = conditioner.getMinTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOn() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        Boolean expected =true;
        boolean actual = conditioner.isOn();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentTemperatureReturnMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(26);
        int expected = 0;
        int actual = conditioner.getCurrentTemperature();
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(14);
        int expected1 = 0;
        int actual1 = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }




}