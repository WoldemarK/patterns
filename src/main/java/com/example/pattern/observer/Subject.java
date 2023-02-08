package com.example.pattern.observer;

public interface Subject {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
