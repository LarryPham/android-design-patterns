package com.capsule.patterns.observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

    boolean getReady();
    void setReady(boolean ready);
}
