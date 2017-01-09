package com.capsule.patterns.decorator;

public abstract class Bread {
    protected String mDescription;
    protected int mKCal;

    public String getDescription() {
        return mDescription;
    }

    public int getKCal() {
        return mKCal;
    }
}
