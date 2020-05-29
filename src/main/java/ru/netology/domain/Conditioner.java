package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;
    private int increaseCurrentTemperature;
    private int decreaseCurrentTemperature;

    public int getIncreaseCurrentTemperature() {
        return increaseCurrentTemperature;
    }

    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        if (currentTemperature == maxTemperature) {
            return;
        }
        currentTemperature++;
        this.increaseCurrentTemperature =increaseCurrentTemperature;
}

    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }

    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        if (currentTemperature == minTemperature) {
            return;
        }
        currentTemperature--;
        this.decreaseCurrentTemperature = decreaseCurrentTemperature;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = 25;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = 15;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
