package com.example.pattern.observer;

public class PerseveranceTest {
    public static void main(String[] args) {
        Perseverance perseverance = new Perseverance();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(perseverance);

        perseverance.onNewData(new PerseveranceData(-25, 0.6, "кратер Езеро"));
        System.out.println("--------------");

        perseverance.unregisterObserver(temperatureDisplay);
        perseverance.onNewData(new PerseveranceData(-35, 0.5, "море Дождей"));
    }
}
