package com.capsule.patterns.decorator;

public class Butter extends BreadDecorator {

    private Bread mBread;

    public Butter(Bread bread) {
        this.mBread = bread;
    }

    @Override
    public String getDescription() {
        return mBread.getDescription() + " Butter";
    }

    @Override
    public int getKCal() {
        return mBread.getKCal() + 50;
    }
}
