package com.example.pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class Perseverance implements Subject{
    private PerseveranceData data;
    private final Set<Observer> observers = new HashSet<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(data);
    }
    public PerseveranceData getData() {
        return data;
    }
    public void onNewData(PerseveranceData newData) {
        this.data = newData;
        notifyObservers();
    }
}
