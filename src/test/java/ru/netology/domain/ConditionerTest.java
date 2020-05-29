package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();
    }

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.setIncreaseCurrentTemperature(21);
        conditioner.getIncreaseCurrentTemperature();
        assertEquals(21, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.setIncreaseCurrentTemperature(27);
        conditioner.getIncreaseCurrentTemperature();
        assertEquals(25, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.setIncreaseCurrentTemperature(19);
        conditioner.getIncreaseCurrentTemperature();
        assertEquals(19, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("LG");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.setIncreaseCurrentTemperature(14);
        conditioner.getIncreaseCurrentTemperature();
        assertEquals(15, conditioner.getIncreaseCurrentTemperature());
    }
}