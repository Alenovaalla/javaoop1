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
        conditioner.increaseCurrentTemperature(1);
        int expected = 21;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(21, actual);
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature(1);
        int expected = 19;
        int actual = conditioner.getCurrentTemperature();

        assertEquals(19, actual);

    }

    @Test
    public void shouldDecreaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature(1);
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
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature(1);
        int expected = 25;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

}