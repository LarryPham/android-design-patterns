package com.capsule.patterns.observer;

import java.util.ArrayList;

public class Sandwich implements Subject {

    private boolean mIsReady;

    private ArrayList<Observer> mObservers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public boolean getReady() {
        return mIsReady;
    }

    @Override
    public void setReady(boolean ready) {
        mIsReady = ready;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: mObservers) {
            observer.update();
        }
    }
}
