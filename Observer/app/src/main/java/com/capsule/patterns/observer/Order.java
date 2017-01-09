package com.capsule.patterns.observer;

public class Order implements Observer {

    private Subject mSubject;

    public Order(Subject subject) {
        this.mSubject = subject;
    }

    @Override
    public String update() {
        if (mSubject.getReady()) {
            mSubject.unregister(this);
            return "Your order is ready to collect";
        } else {
            return "Your sandwich will be ready very soon...";
        }
    }
}
