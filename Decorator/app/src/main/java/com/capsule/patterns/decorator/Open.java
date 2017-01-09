package com.capsule.patterns.decorator;

public class Open extends BreadDecorator {

    private Bread mBread;

    public Open(Bread mBread) {
        this.mBread = mBread;
    }

    @Override
    public String getDescription() {
        return mBread.getDescription() + " Open";
    }

    @Override
    public int getKCal() {
        return mBread.getKCal() / 2;
    }
}
